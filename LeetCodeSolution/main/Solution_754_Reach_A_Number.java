public class Solution_754_Reach_A_Number {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int ini = 1;
        int sum = 1;
        while (sum < target){
            ini = ini + 1;
            sum = sum + ini;
        }
        while ((sum - target)%2!=0){
            ini = ini + 1;
            sum = sum + ini;
        }
        return ini;
    }
    // �����ύʱ�� 20190615
    // ��������ʱ�� 1ms ���� 91.67% �û�
    // ���������ڴ� 32.9MB ���� 33.33% �û�
}
