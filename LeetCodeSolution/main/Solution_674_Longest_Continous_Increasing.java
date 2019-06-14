public class Solution_674_Longest_Continous_Increasing {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int len = nums.length;
        if (len==0){
            return 0;
        }
        int k = 1;
        int m = 1;
        while (k < len){
            if (nums[k] > nums[k-1]){
                m++;
                if (k==len-1){
                    max = Math.max(m,max);
                }
            }else{
                max = Math.max(m,max);
                m = 1;
            }
            k++;
        }
        return max;
    }
    // ����ύʱ�� 20190612
    // ����ʱ�� 1ms ���� 99.88% �û�
    // �����ڴ� 36.7MB ���� 100.00% �û�
}
