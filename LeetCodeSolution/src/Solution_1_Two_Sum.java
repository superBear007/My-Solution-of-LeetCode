/*
1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

 */

import java.util.Arrays;

public class Solution_1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++){
            for (int j = i + 1 ; j < len; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        Solution_1_Two_Sum solution = new Solution_1_Two_Sum();
        System.out.println(solution.twoSum(nums,target)[0]);
        System.out.println(solution.twoSum(nums,target)[1]);
    }
    // 最终，提交时间2019-5-6
    // 提交用时38m，超过15.38% 的用户
    // 占用内存38.6m，超过39.59% 的用户
    // 这个成绩并不理想，事实上这是最简单粗暴的方法，还有很大的改进空间，比如事先将nums排序
    // 并且获得排序之后的原数组的索引，下次遍历时只要遍历到nums[i] + nums[j] > target，并且排序
    // 所引起的时间复杂度可以小于o(n^2)
}
