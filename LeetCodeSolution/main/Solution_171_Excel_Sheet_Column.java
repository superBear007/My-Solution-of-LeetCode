import java.util.HashMap;

public class Solution_171_Excel_Sheet_Column {
    public int titleToNumber(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char) ('A' + i), i + 1);
        }
        int res = 0;
        int m = s.length() - 1;
        int n = 1;
        while (m >= 0) {
            res = res + map.get(s.charAt(m)) * n;
            n = n * 26;
            m--;
        }
        return res;
    }
    // 最终提交时间 20190515
    // 运行时间 3ms 超过 6.25% 用户
    // 运行内存 35.4MB 超过 60.63% 用户
}
