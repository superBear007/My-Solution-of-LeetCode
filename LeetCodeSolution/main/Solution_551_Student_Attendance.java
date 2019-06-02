import java.util.Arrays;

public class Solution_551_Student_Attendance {
    public boolean checkRecord(String s){
        if (s.contains("LLL")){
            return false;
        }
        char[] chr = s.toCharArray();
        Arrays.sort(chr);
        String res = String.valueOf(chr);
        return !res.contains("AA");
    }
    // 提交时间 20190602
    // 运行时间 2ms 超过 39.53% 用户
    // 运行内存 33.8MB 超过 100.00% 用户
}
