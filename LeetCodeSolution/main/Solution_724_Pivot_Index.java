public class Solution_724_Pivot_Index {
    public int pivotIndex(int[] nums) {
        if (nums.length <= 2){return -1;}
        int sum = 0;
        for (int n : nums){sum = sum + n;}
        int ind = 0;
        int left = 0;
        int right = sum - nums[0];
        while (ind <= nums.length - 2){
            if (left == right){
                return ind;
            }else{
                // [1,2,3,4,ind,8]
                // [1,2,3,4,5,ind]
                left = left + nums[ind];
                right = right - nums[ind+1];
                ind++;
            }
        }
        if (left == right){
            return nums.length - 1;
        }else{
            return -1;
        }
    }
    // 最终提交时间 20190614
    // 最终运行时间 1ms 超过 100.00% 用户
    // 最终运行内存 40.1MB 超过 95.64% 用户
}
