import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_645_Set_Mismatch {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int len = nums.length;
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < len; i++){num.add(i+1);}
        for (int i = 0; i < len; i++){num.remove(Integer.valueOf(nums[i]));}
        res[1] = num.get(0);
        for (int i = 0; i < len-1; i++){
            if (i!=len-1&&nums[i]==nums[i+1]){
                res[0] = nums[i];
                break;
            }
        }
        return res;
    }
}
