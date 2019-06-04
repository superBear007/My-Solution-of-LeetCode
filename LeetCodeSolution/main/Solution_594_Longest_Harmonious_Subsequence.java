import java.util.Arrays;

public class Solution_594_Longest_Harmonious_Subsequence {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len == 0){return 0;}
        int maxCnt = 0;
        for (int i = 0; i < len; i++){
            for (int j = len - 1; j > i; j--){
                if (nums[j] - nums[i] == 1){
                    maxCnt = Math.max(maxCnt,j - i + 1);
                    break;
                }
            }
        }
        return maxCnt;
    }
    // 提交时间 20190604
    // 运行时间 302ms ，超过了 5.51% 用户
    // 运行内存 58.9MB, 超过 5.12% 用户
}
