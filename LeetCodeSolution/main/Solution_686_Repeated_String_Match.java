public class Solution_686_Repeated_String_Match {
    public int repeatedStringMatch(String A, String B) {
        String tmp = A;
        int len = A.length();
        int ini = 1;
        while (ini <= 5000/len){
            if (A.contains(B)){
                return ini;
            }
            A = A.concat(tmp);
            ini++;
        }
        return -1;
    }
    // �����ύʱ�� 20190613
    // ����ʱ�� 647ms ���� 5.03% �û�
    // �����ڴ� 37MB ���� 98.34% �û�
}
