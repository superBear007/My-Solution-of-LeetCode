public class Solution_441_Arranging_Coins {
    public int arrangeCoins(int n) {
        // ���ո��������������յ�һ��1�����ڶ���2�����������ż���
        // Ӧ���� k^2 + k < n
        int res = (int)(Math.sqrt(2)*Math.sqrt(n + 0.125)-0.5);
        return res;
    }
    // �����ύʱ�� 20190526
    // ����ʱ�� 1ms������ 100% �û�
    // �����ڴ� 32.9MB, ���� 54.56% �û�
}
