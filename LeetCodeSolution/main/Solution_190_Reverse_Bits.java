public class Solution_190_Reverse_Bits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;
            if (i < 31) {
                result <<= 1;
            }
        }
        return result;
    }
    // �����ύʱ�� 20190516
    // ����ʱ�� 0ms ������ 99.98% �û�
    // �����ڴ� 28.4MB ������ 16.86% �û�
}
