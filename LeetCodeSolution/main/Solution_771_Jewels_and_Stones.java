public class Solution_771_Jewels_and_Stones {
    public int numJewelsInStones(String J, String S) {
         int len = S.length();
         int res = 0;
         for (int i = 0; i < len; i++){
             if (J.contains(S.substring(i,i+1))){
                 res++;
             }
         }
         return res;
    }
    // 最终提交时间 20190615
    // 最终运行时间 1ms 超过 96.91% 用户
    // 最终运行内存 34.8MB 超过 99.80% 用户
}
