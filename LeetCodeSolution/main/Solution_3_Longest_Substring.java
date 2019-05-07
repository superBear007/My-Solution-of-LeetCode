/**
 * 3. Given a string, find the length of the longest substring without repeating characters.
 */
public class Solution_3_Longest_Substring {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int iniI = 0;
        int iniJ = 1;
        int maxLen = 1;
        while (iniJ < len){
            String thisStr = s.substring(iniI,iniJ);
            if (thisStr.contains(s.substring(iniJ,iniJ+1))){
                maxLen = maxLen > iniJ - iniI ? maxLen : iniJ - iniI;
                iniI = iniI + 1 + thisStr.indexOf(s.charAt(iniJ));
            }
            iniJ = iniJ + 1;
        }
        maxLen = maxLen > iniJ - iniI ? maxLen : iniJ - iniI;
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "kewerrmew";
        Solution_3_Longest_Substring sol = new Solution_3_Longest_Substring();
        System.out.println(sol.lengthOfLongestSubstring(s));
    }
    // 最终提交时间为20190507
    // 执行时间为6ms，超过93.85%用户
    // 执行内存为39.4m，超过15.77%用户
}
