public class Solution_191_Number_of_1_Bits {
    // ������λ����1������
    public int hamminWeight(int n){
        int count = 0;
        while (n!=0){
            count = count + (n&1);
            n >>>=1;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution_191_Number_of_1_Bits sol = new Solution_191_Number_of_1_Bits();
        System.out.println(sol.hamminWeight(00000000000000000000000000001011));
    }
    /// �����ύʱ�� 20190518
    /// ����ʱ�� 0ms ���� 100% �û�
    /// �����ڴ� 32.3MB ���� 46.17% �û�
}
