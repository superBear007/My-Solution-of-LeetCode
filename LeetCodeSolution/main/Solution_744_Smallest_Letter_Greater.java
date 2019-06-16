import java.util.Arrays;

public class Solution_744_Smallest_Letter_Greater {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        int len = letters.length;
        if (letters[len-1] <= target){
            return letters[0];
        }
        for (char chr : letters){
            if (chr > target){
                return chr;
            }
        }
        return 'a';
    }
    // 最终提交时间 20190614
    // 最终运行时间 4ms 超过 23.94% 用户
    // 最终运行内存 39.1MB 超过 83.15% 用户
}
