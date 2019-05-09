public class Solution_53_Maximum_SubArray {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int ans = nums[0];
        int maxSum = nums[0];
        if (len == 1){return maxSum;}
        for (int i = 1; i < len; i++) {
            // 这个地方的意思是 每次确定是否结束前边的序列
            // 只要前边的maxSum大于0，就说明前面没给后面拖后腿，就可以继续下去
            maxSum = (maxSum + nums[i] > nums[i]) ? (maxSum + nums[i]) : nums[i];
            // 但我们还没法保证加了后面一位会不会给前面的序列拖后腿，所以要记录每次增加之后的maxSum的最大值
            ans = ans>maxSum?ans:maxSum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Solution_53_Maximum_SubArray sol = new Solution_53_Maximum_SubArray();
        System.out.println(sol.maxSubArray(nums));
    }

    // 最终提交时间为 20190509
    // 运行占用时间 1ms 超过 95.90% 用户
    // 运行占用内存 38.9MB 超过 86.26% 用户
}
