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
    // �����ύʱ�� 20190615
    // ��������ʱ�� 1ms ���� 96.91% �û�
    // ���������ڴ� 34.8MB ���� 99.80% �û�
}
