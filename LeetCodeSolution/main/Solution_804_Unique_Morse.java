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
    // 最终提交时间 20190616
    // 最终运行时间 2ms 超过 79.78% 用户
    // 最终运行内存 35.8MB 超过 98.65% 用户
}
