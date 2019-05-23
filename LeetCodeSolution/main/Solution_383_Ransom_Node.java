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
    // 最终提交时间 20190523
    // 运行时间 9ms 超过 45.54% 用户
    // 运行内存 36.7MB 超过 99.03% 用户
}
