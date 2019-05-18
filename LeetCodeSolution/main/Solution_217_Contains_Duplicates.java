import java.util.Arrays;

public class Solution_217_Contains_Duplicates {
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        if (nums.length==1){
            return false;
        }
        for (int m = 1; m < nums.length; m++){
            if (nums[m]==nums[m-1]){
                return true;
            }
        }
        return false;
    }
    // 最终提交时间 20190518
    // 最终运行时间 3ms 超过 99.14% 用户
    // 最终提交时间 43.5MB 超过 38.39% 用户
}
