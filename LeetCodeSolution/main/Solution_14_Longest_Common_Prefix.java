public class Solution_14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        // 首先获得这些字符串的最小长度
        int len = strs.length;
        // 这个地方是专门为了测试用例加的，居然还有空字符串的用例，真是无聊
        if (len == 0){return "";}
        int minLen = strs[0].length();
        for (int k = 1; k < len; k++){
            if (minLen > strs[k].length()){
                minLen = strs[k].length();
            }
        }
        String iniStr = "";
        // 接着开始逐渐增加前缀，直到不被满足为止
        myLabel:
        for (int i = 0; i < minLen; i++){
            iniStr = iniStr.concat(strs[0].substring(i,i+1));
            for (int j = 1; j < len; j++){
                if (!strs[j].substring(0,i+1).equals(iniStr)){
                    iniStr = iniStr.substring(0,i);
                    break myLabel;
                }
            }
        }
        return iniStr;
    }

    public static void main(String[] args) {
        Solution_14_Longest_Common_Prefix sol = new Solution_14_Longest_Common_Prefix();
        String[] strs = {"dog","racecar","car"};
        System.out.println(sol.longestCommonPrefix(strs));
    }

    // 最终提交时间 20190508
    // 运行时间 2ms，超过 65.65% 用户
    // 运行内存 36.9MB, 超过 94.77% 用户
}
