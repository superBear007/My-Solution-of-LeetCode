import java.util.Arrays;

public class Solution_169_Majority_Element {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int m = 0;
        int k = nums[0];
        int count = 0;
        while (m < len){
            if (nums[m] == k){
                count++;
                if (count > len/2){
                    return k;
                }
            }else{
                k = nums[m];
                count = 1;
            }
            m++;
        }
        return -1;
    }
    // 最终提交时间 20190515
    // 最终运行时间 3ms 超过 73.09% 用户
    // 最终运行内存 40.7MB 超过 93.42% 用户
}
