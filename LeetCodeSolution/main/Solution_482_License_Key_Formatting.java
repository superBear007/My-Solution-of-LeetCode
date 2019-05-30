public class Solution_482_License_Key_Formatting {
    public String licenseKeyFormatting(String S, int K) {
         S = S.replace("-","").toUpperCase();
         int len = S.length();
         String res = "";
         while (len >= K){
             if ("".equals(res)){
                 res = S.substring(len-K,len);
             }else{
                 res = S.substring(len-K,len) + "-" + res;
             }
             len = len - K;
         }
         if ("".equals(res)){
             if (len!=0) {
                 res = S.substring(0, len);
             }
         }else{
             if (len!=0) {
                 res = S.substring(0, len) + "-" + res;
             }
         }
         return res;
    }
    //最终提交时间 20190530
    //运行时间347ms 超过 11.84% 用户
    //运行内存36.8MB 超过 99.89% 用户
}
