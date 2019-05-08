public class Solution_35_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        for (int k = 0; k < len; k++){
            if (nums[k] == target){
                return k;
            }
            if (nums[k] > target){
                return k;
            }
        }
        return len;
    }
    // 最终提交时间为 20190508
    // 运行时间为 0ms ，超过 100% 用户
    // 运行内存 38MB , 超过 93.25% 用户
}
