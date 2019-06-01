import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_532_Kdiff_Pairs {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        List<Integer> arr = new ArrayList<>();
        for (int m : nums){arr.add(m);}
        int res = 0;
        for (int i = 0; i < len-1; i++){
            if (i==0 ||( i > 0 && !arr.get(i).equals(arr.get(i-1)))){
                if (arr.subList(i+1,len).contains(arr.get(i)+k)){
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution_532_Kdiff_Pairs sol = new Solution_532_Kdiff_Pairs();
        System.out.println(sol.findPairs(new int[]{3,1,4,1,5},2));
    }
    // 最终提交时间 20190601
    // 运行时间 199ms 超过 7.00% 用户
    // 运行内存 38.8MB 超过 98.86% 用户
}
