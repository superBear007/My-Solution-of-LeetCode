public class Solution_9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int len = str.length();
        if (len == 1){
            return true;
        }
        for (int k = 0; k < len/2 + 1; k++){
            if (str.charAt(k) != str.charAt(len - k - 1)){
                return false;
            }
        }
        return true;
    }
    // 最终提交时间为 20190507
    // 运行时间 8ms 超过 79.55% 用户
    // 运行内存 35.3MB 超过 100% 用户
}
