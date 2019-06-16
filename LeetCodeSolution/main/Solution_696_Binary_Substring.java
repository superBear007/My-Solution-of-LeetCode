import java.util.ArrayList;
import java.util.List;

public class Solution_696_Binary_Substring {
    public int countBinarySubstrings(String s) {
        int len = s.length();
        char[] schr = s.toCharArray();
        int count = 1;
        int res = 0;
        List<Integer> cnt = new ArrayList<>();
        for (int i = 0; i < len - 1; i++){
            if (schr[i] == schr[i+1]){
                count++;
            }else{
                cnt.add(count);
                count = 1;
            }
            if (i == len - 2){
                cnt.add(count);
            }
        }
        int l = cnt.size();
        if (l <= 1){return 0;}
        for (int m = 0; m < l - 1; m++){
            res = res + Math.min(cnt.get(m),cnt.get(m+1));
        }
        return res;
    }

    public static void main(String[] args) {
        Solution_696_Binary_Substring sol = new Solution_696_Binary_Substring();
        sol.countBinarySubstrings("00110");
    }
    // 最终提交时间 20190614
    // 运行时间 21ms 超过 11.86% 用户
    // 运行内存 37MB 超过 100.00% 用户
}
