import java.util.HashSet;
import java.util.Set;

public class Solution_804_Unique_Morse {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] map = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String str:words){
            String res = "";
            for (int k = 0; k < str.length(); k++){
                res = res + map[str.charAt(k) - 'a'];
            }
            set.add(res);
        }
        return set.size();
    }
    // �����ύʱ�� 20190616
    // ��������ʱ�� 2ms ���� 79.78% �û�
    // ���������ڴ� 35.8MB ���� 98.65% �û�
}
