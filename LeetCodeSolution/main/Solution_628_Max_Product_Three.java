import java.util.Arrays;

public class Solution_628_Max_Product_Three {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int res1 = nums[0]*nums[1]*nums[len-1];
        int res2 = nums[len-3]*nums[len-2]*nums[len-1];
        int res3 = nums[0]*nums[2]*nums[1];
        return Math.max(Math.max(res1,res2),res3);
    }
    // 最终提交时间 20190611
    // 运行时间 14ms 超过 51.39% 用户
    // 运行内存 39.3MB 超过 98.50% 用户
}
