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
    // �ύʱ�� 20190602
    // ����ʱ�� 2ms ���� 39.53% �û�
    // �����ڴ� 33.8MB ���� 100.00% �û�
}
