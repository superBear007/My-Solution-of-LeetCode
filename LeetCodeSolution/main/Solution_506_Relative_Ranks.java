import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_506_Relative_Ranks {
    public String[] findRelativeRanks(int[] nums) {
        int len = nums.length;
        int[] arr = Arrays.copyOf(nums,len);
        Arrays.sort(arr);
        List<Integer> arrList = new ArrayList<>();
        for (int m:arr){arrList.add(m);}
        String[] res = new String[len];
        for (int k = 0; k < len; k++){
            if (arrList.indexOf(nums[k])==len-1){
                res[k] = "Gold Medal";
            }else if(arrList.indexOf(nums[k])==len-2){
                res[k] = "Silver Medal";
            }else if (arrList.indexOf(nums[k])==len-3){
                res[k] = "Bronze Medal";
            }else{
                res[k] = len - arrList.indexOf(nums[k]) + "";
            }
        }
        return res;
    }
    // 最终提交时间 20190601
    // 最终运行时间 91ms 超过 5.02% 用户
    // 最终运行内存 38.9MB 超过 90.78% 用户
}
