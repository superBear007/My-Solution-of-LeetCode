import java.util.Arrays;

public class Solution_136_Single_Number {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len/2; i++){
            if (nums[2*i] < nums[2*i + 1]){
                return nums[2*i];
            }
        }
        return nums[len-1];
    }
    // 最终提交时间 20190515
    // 运行时间 3ms 超过42.38% 用户
    // 运行内存 38.2MB 超过 87.93% 用户
}
