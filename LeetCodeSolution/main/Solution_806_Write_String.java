public class Solution_806_Write_String {
    public int[] numberOfLines(int[] widths, String S) {
        int r = 0;
        int len = S.length();
        int m = 0;
        int slen = 0;
        while (m < len){
            if (slen + Integer.valueOf(widths[S.charAt(m) - 'a']) > 100){
                r++;
                slen = Integer.valueOf(widths[S.charAt(m) - 'a']);
            }else{
                slen = slen + Integer.valueOf(widths[S.charAt(m) - 'a']);
            }
            m++;
        }
        return new int[]{r+1,slen};
    }
    // 最终提交时间 20190516
    // 最终运行时间 1ms 超过 31.22% 用户
    // 最终运行内存 35.1MB 超过 99.80% 用户
}
