public class Solution_704_Binary_Search {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        if (nums[left] == target){
            return left;
        }else if(nums[left] > target){
            return -1;
        }
        if (nums[right] == target){
            return right;
        }else if(nums[right] < target){
            return -1;
        }
        while (left < right){
            int middle = (left + right)/2;
            if (nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                right = middle;
            }else{
                left = middle + 1;
            }
        }
        return -1;
    }
    // 最终提交时间 20190614
    // 最终运行时间 0ms 超过 100.00% 用户
    // 最终运行内存 40.1MB 超过 83.08% 用户
}
