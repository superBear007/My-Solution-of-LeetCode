import java.util.Stack;

public class Solution_27_Remove_Element {
    public int removeElement(int[] nums, int val) {
         int len = nums.length;
         int res = len;
         int ind = 0;
         for (int i = 0; i < len; i++){
             if (nums[i] == val){
                 res--;
             }
             while (i+ind < len && nums[i+ind] == val){
                 ind++;
             }
             if (i+ind<len){
                 nums[i] = nums[ind+i];
             }
         }
         return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,2,0,2,2,1,4,4,1,4,3,2};
        Solution_27_Remove_Element sol = new Solution_27_Remove_Element();
        System.out.println(sol.removeElement(nums,4));
    }

    // 最终提交时间 20190508
    // 运行时间0ms 超过 100.00% 的用户
    // 运行时间34.3MB 超过100.00% 的用户
}
