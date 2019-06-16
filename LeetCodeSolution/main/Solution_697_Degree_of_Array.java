import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_697_Degree_of_Array {
    public int findShortestSubArray(int[] nums) {
        List<Integer> maxList = maxDegree(nums);
        int min = nums.length;
        for (Integer a : maxList){
            int left = 0;
            int right = nums.length - 1;
            while (nums[left]!=a){
                left ++;
            }
            while (nums[right]!=a){
                right --;
            }
            min = Math.min(min,right - left + 1);
        }
        return min;
    }
    public List<Integer> maxDegree(int[] nums){
        int max = 1;
        int[] num = new int[nums.length + 1];
        for (int m = 0; m < nums.length; m++){
            num[m] = nums[m];
        }
        num[nums.length] = Integer.MAX_VALUE;
        Arrays.sort(num);
        num[nums.length] = -1;
        List<Integer> res = new ArrayList<>();
        int count = 1;
        for (int m = 0; m < num.length - 1; m++){
            if (num[m] == num[m+1]){
                count++;
            }else{
                if (max < count){
                    max = count;
                    res = new ArrayList<>();
                    res.add(num[m]);
                }else if (max == count){
                    res.add(num[m]);
                }
                count = 1;
            }
        }
        return res;
    }
    // 最终提交时间 20190614
    // 最终运行时间 79ms 超过 6.03% 用户
    // 最终运行内存 41.5MB 超过 78.82% 用户
}
