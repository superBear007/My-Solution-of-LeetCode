public class Solution_219_Contains_Duplicates_2 {
    // 判断是否存在距离在k以内的相同元素
    public boolean containsNearbyDuplicate(int[] nums,int k){
        int len = nums.length;
        for (int i = 0; i < len; i++){
            for (int j = i+1; j <= i+k; j++){
                if (j < len && nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    // 最终提交时间 20190518
    // 最终运行时间 1046ms 超过 5.04% 用户
    // 最终运行内存 40.8MB 超过 83.77% 用户
}
