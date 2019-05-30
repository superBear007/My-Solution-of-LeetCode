public class Solution_485_Max_Consecutives_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int maxCnt = 0;
        int cnt = 0;
        for (int m = 0; m < len; m++){
            if (nums[0]==1){
                cnt++;
            }else{
                maxCnt = Math.max(cnt,maxCnt);
                cnt = 0;
            }
        }
        maxCnt = Math.max(cnt,maxCnt);
        return maxCnt;
        // 最终提交时间 20190530
        // 运行时间 2ms 超过 99.87% 用户
        // 运行内存 37.7MB 超过 99.68% 用户
    }
}
