public class Solution_66_Plus_One {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int ind = 1;
        for (int k = len - 1; k >= 0; k--){
            if (digits[k] + ind == 10){
                digits[k] = 0;
                ind = 1;
            }else{
                digits[k] = digits[k] + ind;
                ind = 0;
            }
        }
        if (digits[0] != 0){
            return digits;
        }else{
            int[] newDigits = new int[len+1];
            newDigits[0] = 1;
            for (int i = 0; i < len; i++){
                newDigits[i+1] = digits[i];
            }
            return newDigits;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,2,1};
        Solution_66_Plus_One sol = new Solution_66_Plus_One();
        sol.plusOne(nums);
    }

    // 最终提交时间 20190509
    // 运行时间 0ms 超过 100% 用户
    // 运行内存 34.5MB 超过 100% 用户
}
