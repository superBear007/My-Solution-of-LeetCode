
public class Solution_5_Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        int len = s.length();
        int ini = 0;
        int maxLen = 0;
        String maxStr = "";
        while (ini < len - maxLen){
            for (int j = ini + maxLen + 1; j <= len; j++){
                String thisStr = s.substring(ini,j);
                if (isPalindromic(thisStr)& thisStr.length() > maxLen){
                    maxLen = thisStr.length();
                    maxStr = thisStr;
                }
            }
            ini++;
        }
        return maxStr;
    }

    private boolean isPalindromic(String thisStr) {
        int len = thisStr.length();
        if (len==1){return true;}
        for (int i = 0; i <= len/2; i++){
            if (thisStr.charAt(i)!=thisStr.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "babad";
        Solution_5_Longest_Palindromic_Substring sol = new Solution_5_Longest_Palindromic_Substring();
        System.out.println(sol.longestPalindrome(s));
    }
    // 最终提交时间20190507
    // 提交用时364ms，超过12.13% 的用户
    // 提交内存占用 36.2MS, 超过96.32% 的用户
    // PS: 说实话内存占用这么少确实挺意外的，总体来说，这个题目还是有优化空间的
}
