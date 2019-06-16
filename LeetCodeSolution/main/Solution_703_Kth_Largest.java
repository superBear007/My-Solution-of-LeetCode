import java.util.Arrays;

public class Solution_703_Kth_Largest {

}
class KthLargest {
    int[] nums;
    int k;
    public KthLargest(int k, int[] nums) {
        this.nums = nums;
        this.k = k;
    }
    public int add(int val) {
        int[] num = new int[nums.length + 1];
        for (int m = 0; m < nums.length; m++){
            num[m] = nums[m];
        }
        num[nums.length] = val;
        nums = num;
        Arrays.sort(num);
        return num[nums.length - k];
    }
    // 最终提交时间 20190614
    // 最终运行时间 731ms 超过 5.01% 用户
    // 最终运行内存 60.4MB 超过 5.01% 用户
}
