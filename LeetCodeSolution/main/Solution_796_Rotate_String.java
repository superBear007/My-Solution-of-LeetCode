public class Solution_796_Rotate_String {
    public boolean rotateString(String A, String B) {
        if (A.length()!=B.length()){
            return false;
        }
        return (A + A).contains(B);
    }
    // �����ύʱ�� 20190616
    // ��������ʱ�� 0ms ���� 100% �û�
    // ���������ڴ� 34.3MB ���� 100% �û�
}
