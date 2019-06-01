public class Solution_507_Perfect_Number {
    public boolean checkPerfectNumber(int num) {
        if (num <= 0){return false;}
        int m = (int) Math.sqrt(num);
        int sum = 1;
        for (int k = 2; k <= m; k++){
            if (num%k==0){
                sum = sum + k + num/k;
            }
        }
        if (num == m*m) {
            sum = sum - m;
        }
        return num==sum;
    }

    public static void main(String[] args) {
        Solution_507_Perfect_Number sol = new Solution_507_Perfect_Number();
        System.out.println(sol.checkPerfectNumber(6));
    }
    // �����ύʱ�� 20190601
    // ��������ʱ�� 1ms ���� 98.05% �û�
    // ���������ڴ� 32.3MB ���� 61.87% �û�
}
