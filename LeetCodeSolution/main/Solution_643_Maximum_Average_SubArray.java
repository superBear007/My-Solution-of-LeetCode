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
    // 最终提交时间 20190611
    // 运行时间 3ms 超过 97.70% 用户
    // 运行内存 41.9MB 超过 61.57% 用户
}
