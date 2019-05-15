public class Solution_167_Two_Sum_2 {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        for (int i = 0; i < len; i++){
            for (int j = i+1; j < len; j++){
                if (numbers[i] + numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
                if (numbers[i] + numbers[j] > target){
                    break;
                }
            }
        }
        return new int[]{1,1};
    }
    // 最终提交时间 20190515
    // 最终运行时间 46ms 超过 11.49% 用户
    // 最终运行内存 37.3MB 超过 57.11% 用户
}
