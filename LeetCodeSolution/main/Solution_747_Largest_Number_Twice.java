public class Solution_747_Largest_Number_Twice {
    public int dominantIndex(int[] nums) {
        int sec = 0;
        int max = 0;
        int ind = -1;
        for (int n = 0; n < nums.length; n++){
            if (nums[n] > max){
                sec = max;
                max = nums[n];
                ind = n;
            }else{
                sec = Math.max(nums[n],sec);
            }
        }
        if (max >= 2*sec) {
            return ind;
        }else{
            return -1;
        }
    }
    // �����ύʱ�� 20190614
    // ��������ʱ�� 0ms ���� 100% �û�
    // ���������ڴ� 38.9MB ���� 50.79% �û�
}
