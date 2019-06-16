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
    // �����ύʱ�� 20190614
    // ��������ʱ�� 4ms ���� 23.94% �û�
    // ���������ڴ� 39.1MB ���� 83.15% �û�
}
