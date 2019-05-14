public class Solution_125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        // 首先去掉无用的字符
        s = s.toLowerCase();
        for (int i = 0; i < 48; i++){
            s = s.replace(String.valueOf((char)i),"");
        }
        for (int i = 58; i < 97; i++){
            s = s.replace(String.valueOf((char)i),"");
        }
        for (int j = 123; j < 127; j++){
            s = s.replace(String.valueOf((char)j),"");
        }
        if ("".equals(s)){return true;}
        // 计算回文
        int k = s.length();
        for (int m = 0; m < k/2 + 1; m++){
            if (s.charAt(m)!=s.charAt(k-m-1)){
                return false;
            }
        }
        return true;
    }

    // 最终提交时间 20190514
    // 运行时间 65ms 超过 5.31% 用户
    // 运行内存 39.4MB 超过 15.19% 用户
    public static void main(String[] args) {
        System.out.println(String.valueOf((char)97));
    }
}
