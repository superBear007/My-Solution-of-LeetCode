public class Solution_680_Valid_Palindrome_2 {
    public boolean validPalindrome(String s) {
        if (isPalindrome(s)){
            return true;
        }
        int len = s.length();
        String res = s;
        int left = 0;
        int right = len - 1;
        while (left < right && s.charAt(left) == s.charAt(right)){
            res = s.substring(left+1,right);
            left++;
            right--;
        }
        if (res.length() <= 2){
            return true;
        }
        return isPalindrome(res.substring(1)) || isPalindrome(res.substring(0,res.length()-1));
    }
    public boolean isPalindrome(String s){
        if (s.length()<=1){
            return true;
        }
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        String s = "atbbga";
        Solution_680_Valid_Palindrome_2 sol = new Solution_680_Valid_Palindrome_2();
        sol.validPalindrome(s);
    }
    // �����ύʱ�� 20190613
    // ����ʱ�� 533ms ���� 5% �û�
    // �����ڴ� 42MB ���� 5% �û�
}
