public class Solution_172_Trailing_Zeros {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5){
            count = count + n/5;
            n = n/5;
        }
        return count;
    }
    // �����ύʱ�� 20190515
    // ��������ʱ�� 0ms ���� 100% �û�
    // ���������ڴ� 32.3MB ���� 64.80% �û�
}
