public class Solution_693_Alternating_Bits {
    public boolean hasAlternatingBits(int n) {
        char[] str = Integer.toBinaryString(n).toCharArray();
        int len = str.length;
        for (int m = 0; m < len - 1; m++){
            if (str[m] == str[m+1]){
                return false;
            }
        }
        return true;
    }
    // �����ύʱ�� 20190614
    // ����ʱ�� 1ms ���� 44.77% �û�
    // �����ڴ� 33.1MB ���� 38.78% �û�
}
