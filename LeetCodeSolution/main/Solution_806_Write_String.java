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
    // �����ύʱ�� 20190516
    // ��������ʱ�� 1ms ���� 31.22% �û�
    // ���������ڴ� 35.1MB ���� 99.80% �û�
}
