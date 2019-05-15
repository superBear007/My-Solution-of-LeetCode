public class Solution_189_Rotate_Array {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int j;
        int[] nums0 = new int[len];
        for (int i = 0; i < len; i++){
            j = (i+k)%len;
            nums0[j] = nums[i];
        }
        for (int i = 0; i < len; i++){
            nums[i] = nums0[i];
        }
    }
    // 最终提交时间 20190515
    // 最终运行时间 1ms 超过 40.44% 用户
    // 最终运行内存 36.5MB 超过 57.65% 用户
}
