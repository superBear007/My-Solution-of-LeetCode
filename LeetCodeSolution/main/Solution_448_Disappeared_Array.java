import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_448_Disappeared_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        if (len==0){return res;}
        Arrays.sort(nums);
        int m = 1;
        int ind = 0;
        while (ind < len){
            if (nums[ind] == m){
                m++;
                ind++;
            }else if (nums[ind] > m){
                res.add(m);
                m++;
            }else{
                ind++;
            }
        }
        int k = nums[len-1];
        while (k < len){
            res.add(k+1);
            k++;
        }
        return res;
    }
    // 最后提交时间 20190526
    // 运行时间 22ms 超过 22.87% 用户
    // 运行内存 46.1 MB 超过 99.70% 用户
}
