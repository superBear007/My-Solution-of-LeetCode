import java.util.HashMap;
import java.util.Map;

public class Solution_205_Isomorphic_Strings {
    // 字符串各字符一一对应
    public boolean isIsomorphic(String s,String t){
        int len = s.length();
        Map<Character,Character> maps = new HashMap<>();
        Map<Character,Character> mapt = new HashMap<>();
        for (int m = 0; m < len; m++){
            if (maps.keySet().contains(s.charAt(m))){
                if (maps.get(s.charAt(m))!=t.charAt(m)){
                    return false;
                }
            }else{
                maps.put(s.charAt(m),t.charAt(m));
            }
            if (mapt.keySet().contains(t.charAt(m))){
                if (mapt.get(t.charAt(m))!=s.charAt(m)){
                    return false;
                }
            }else{
                mapt.put(t.charAt(m),s.charAt(m));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution_205_Isomorphic_Strings sol = new Solution_205_Isomorphic_Strings();
        System.out.println(sol.isIsomorphic("egg","add"));
    }
    // 最终提交时间 20190518
    // 最终运行时间 18ms 超过 16.95% 用户
    // 最终运行内存 35.3% 超过 85.27% 用户
}
