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
    // �����ύʱ�� 20190523
    // ����ʱ�� 3ms ���� 52.98% �û�
    // �����ڴ� 36.9MB ���� 92.88% �û�
}
