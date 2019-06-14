public class Solution_633_Sum_of_Square_Numbers {
    public boolean judgeSquareSum(int c) {
       int sqrtc = (int) Math.sqrt(c);
       for (int i = 0; i <= sqrtc; i++){
           int j = c - i*i;
           int k = (int)Math.sqrt(j);
           if (k*k==j){
               return true;
           }
       }
       return false;
    }
    // �����ύʱ�� 20190611
    // ��������ʱ�� 4ms ���� 66.27% �û�
    // ���������ڴ� 33.3MB ���� 49.52% �û�
}
