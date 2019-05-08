

public class Solution_26_Remove_Duplicates {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len < 2){return len;}
        int result = 1;
        int ini = 1;
        for (int i = 1; i < len; i++){
            if (nums[i] > nums[i-1]){
                result++;
                nums[ini] = nums[i];
                ini++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Solution_26_Remove_Duplicates sol = new Solution_26_Remove_Duplicates();
        System.out.println(sol.removeDuplicates(nums));
    }
    // 最终提交时间 20190508
    // 运行时间 1ms 超过 99.97% 用户
    // 运行内存 37.8MB 超过 99.43% 用户
}
