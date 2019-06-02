import java.util.Arrays;

public class Solution_561_Array_Partition_1 {
    public int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i=i+2){
            sum = sum + nums[i];
        }
        return sum;
    }
    // 最终提交时间 20190602
    // 运行时间 14ms 超过 92.10% 用户
    // 运行内存 38.8MB 超过 99.97% 用户
}
