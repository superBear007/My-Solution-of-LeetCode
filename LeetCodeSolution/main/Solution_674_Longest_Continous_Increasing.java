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
    // 最后提交时间 20190612
    // 运行时间 1ms 超过 99.88% 用户
    // 运行内存 36.7MB 超过 100.00% 用户
}
