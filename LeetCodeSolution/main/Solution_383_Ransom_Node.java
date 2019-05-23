public class Solution_383_Ransom_Node {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] s = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        int slen = s.length;
        int mlen = m.length;
        int s0 = 0;
        int m0 = 0;
        while (s0 < slen){
            if (m0 >= mlen){
                return false;
            }
            if (s[s0] == m[m0]){
                s0++;
                m0++;
            }else if(s[s0]<m[m0]){
                s0 ++;
            }else{
                return false;
            }
        }
        return true;
    }
    // �����ύʱ�� 20190523
    // ����ʱ�� 9ms ���� 45.54% �û�
    // �����ڴ� 36.7MB ���� 99.03% �û�
}
