import java.util.HashMap;
import java.util.Map;

public class Solution_168_Excel_Sheet {
    public String convertToTitle(int n) {
        Map<Integer,String> tran = new HashMap<>();
        String res = "";
        for (int i = 1; i < 27; i++){
            tran.put(i,String.valueOf((char)('A'+i-1)));
        }
        while (n > 26){
            res = tran.get((n-1)%26 + 1) + res;
            n = (n-1)/26;
        }
        res = tran.get(n) + res ;
        return res;
    }
    // 最终提交时间 20190515
    // 最终运行时间 0ms 超过 100% 用户
    // 运行内存 32.7MB 超过 100% 用户
    // PS: 总算通过了，这个题目和十进制的弯半天都没绕过来

    public static void main(String[] args) {
        Solution_168_Excel_Sheet sol = new Solution_168_Excel_Sheet();
        System.out.println(sol.convertToTitle(701));
    }
}
