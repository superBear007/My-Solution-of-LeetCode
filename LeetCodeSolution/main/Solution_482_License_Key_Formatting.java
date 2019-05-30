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
    //�����ύʱ�� 20190530
    //����ʱ��347ms ���� 11.84% �û�
    //�����ڴ�36.8MB ���� 99.89% �û�
}
