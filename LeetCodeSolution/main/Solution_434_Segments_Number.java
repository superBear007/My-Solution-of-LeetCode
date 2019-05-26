import javax.print.DocFlavor;

public class Solution_434_Segments_Number {
    public int countSegments(String s) {
        if (s == null || s.length() == 0) return 0;
        String[] strs = s.split(" ");
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (! strs[i].equals("")) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello, my name is John";
        Solution_434_Segments_Number sol = new Solution_434_Segments_Number();
        System.out.println(sol.countSegments(str));
    }
    // 这道题目想得复杂了
    // 最终提交时间 20190526
    // 运行时间 0ms 超过 100% 用户
    // 运行内存 33.1MB 超过 100% 用户
}
