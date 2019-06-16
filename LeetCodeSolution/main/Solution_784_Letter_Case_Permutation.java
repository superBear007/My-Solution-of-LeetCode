import java.util.ArrayList;
import java.util.List;

public class Solution_784_Letter_Case_Permutation {
    List<String> res = new ArrayList<>();
    public List<String> letterCasePermutation(String S) {
        dfs(S,"");
        return res;
    }
    public void dfs(String s,String sc){
        if ("".equals(s)){
            res.add(sc);
        }else{
            if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
                dfs(s.substring(1),sc + (char)(s.charAt(0) - 32));
            }else if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'){
                dfs(s.substring(1),sc + (char)(s.charAt(0) + 32));
            }
            dfs(s.substring(1),sc + s.charAt(0));
        }
    }

    public static void main(String[] args) {
        Solution_784_Letter_Case_Permutation sol = new Solution_784_Letter_Case_Permutation();
        sol.letterCasePermutation("a1b2");
    }
    // 最终提交时间 20190616
    // 最终运行时间 3ms 超过 71.63% 用户
    // 最终运行内存 40.9MB 超过 28.88% 用户
}
