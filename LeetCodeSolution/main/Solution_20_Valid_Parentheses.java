import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution_20_Valid_Parentheses {
    public boolean isValid(String s) {
        int len = s.length();
        if (len == 0){return true;}
        Stack<String> myStack = new Stack<>();
        Map<String,String> map = new HashMap<>();
        map.put("]","[");
        map.put(")","(");
        map.put("}","{");
        for (int i = 0; i < len; i++){
            if (s.substring(i,i+1).equals("(") || s.substring(i,i+1).equals("[") || s.substring(i,i+1).equals("{")){
                myStack.push(s.substring(i,i+1));
            }else{
                if (myStack.size()==0){return false;}
                if (!map.get(s.substring(i,i+1)).equals(myStack.peek())){
                    return false;
                }else{
                    myStack.pop();
                }
            }
        }
        if (myStack.size()>0){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        String s = "{[]}";
        Solution_20_Valid_Parentheses sol = new Solution_20_Valid_Parentheses();
        System.out.println(sol.isValid(s));
    }
    // 最终提交时间为 20190508
    // 运行时间 3ms，超过 64.22% 的用户
    // 运行内存为 35.3MB, 超过 37.53% 的用户
}
