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
    // �����Ŀ��ø�����
    // �����ύʱ�� 20190526
    // ����ʱ�� 0ms ���� 100% �û�
    // �����ڴ� 33.1MB ���� 100% �û�
}
