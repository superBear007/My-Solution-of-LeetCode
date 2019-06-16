public class Solution_747_Largest_Number_Twice {
    public int dominantIndex(int[] nums) {
        int sec = 0;
        int max = 0;
        int ind = -1;
        for (int n = 0; n < nums.length; n++){
            if (nums[n] > max){
                sec = max;
                max = nums[n];
                ind = n;
            }else{
                sec = Math.max(nums[n],sec);
            }
        }
        if (max >= 2*sec) {
            return ind;
        }else{
            return -1;
        }
    }
    // 最终提交时间 20190614
    // 最终运行时间 0ms 超过 100% 用户
    // 最终运行内存 38.9MB 超过 50.79% 用户
}
