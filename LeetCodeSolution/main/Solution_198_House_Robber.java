public class Solution_198_House_Robber {
    // 相邻两家不能偷，最多能偷多少？
    public int rob(int[] nums){
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int maxLag2 = nums[0];
        int maxLag1 = Math.max(nums[0],nums[1]);
        int res = 0;
        if (nums.length == 2){
            return maxLag1;
        }
        for (int i = 2; i < nums.length; i++){
            res = maxLag1>maxLag2+nums[i]?maxLag1:(maxLag2+nums[i]);
            maxLag2 = maxLag1;
            maxLag1 = res;
        }
        return res;
    }
    // 最后提交时间 20190518
    // 运行时间0ms，超过了 100% 用户
    // 运行内存33.1MB, 超过了 100% 用户
}
