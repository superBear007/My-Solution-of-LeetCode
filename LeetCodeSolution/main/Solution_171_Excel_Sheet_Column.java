import java.util.HashMap;

public class Solution_171_Excel_Sheet_Column {
    public int titleToNumber(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char) ('A' + i), i + 1);
        }
        int res = 0;
        int m = s.length() - 1;
        int n = 1;
        while (m >= 0) {
            res = res + map.get(s.charAt(m)) * n;
            n = n * 26;
            m--;
        }
        return res;
    }
    // �����ύʱ�� 20190515
    // ����ʱ�� 3ms ���� 6.25% �û�
    // �����ڴ� 35.4MB ���� 60.63% �û�
}
