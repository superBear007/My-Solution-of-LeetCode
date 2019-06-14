public class Solution_643_Maximum_Average_SubArray {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int inisum = 0;
        for (int i = 0; i < k; i++){inisum+=nums[i];}
        int maxsum = inisum;
        for (int j = 0; j < len - k; j++){
            inisum = inisum - nums[j] + nums[j+k];
            maxsum = Math.max(maxsum,inisum);
        }
        return (double)maxsum/k;
    }
    // �����ύʱ�� 20190611
    // ����ʱ�� 3ms ���� 97.70% �û�
    // �����ڴ� 41.9MB ���� 61.57% �û�
}
