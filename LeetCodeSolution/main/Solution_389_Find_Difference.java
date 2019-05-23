public class Solution_389_Find_Difference {
    public char findTheDifference(String s, String t) {
        char[] schr = s.toCharArray();
        char[] tchr = t.toCharArray();
        int len = schr.length;
        for (int i = 0; i < len; i++){
            if (schr[i]!=tchr[i]){
                return tchr[i];
            }
        }
        return tchr[len];
    }
    // 最终提交时间 20190523
    // 运行时间 3ms 超过 52.98% 用户
    // 运行内存 36.9MB 超过 92.88% 用户
}
