public class Solution_598_Range_Addition_3 {
    public int maxCount(int m, int n, int[][] ops) {
        int a = m;
        int b = n;
        for (int[] k : ops){
            a = Math.min(a,k[0]);
            b = Math.min(b,k[1]);
        }
        return a*b;
    }
    // �����ύʱ�� 20190604
    // ����ʱ�� 0ms������ 100.00% �û�
    // �����ڴ� 37.1MB, ���� 99.14% �û�
}
