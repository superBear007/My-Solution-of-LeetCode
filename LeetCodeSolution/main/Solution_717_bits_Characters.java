public class Solution_717_bits_Characters {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        int ini = 0;
        while (ini < len - 1){
            if (bits[ini] == 0){
                ini++;
            }else{
                ini = ini + 2;
            }
        }
        return ini == len-1;
    }
    // �����ύʱ�� 20190614
    // ��������ʱ�� 0ms ���� 100% �û�
    // ���������ڴ� 36.6MB ���� 100% �û�
}
