public class Solution_125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        // ����ȥ�����õ��ַ�
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
        // �������
        int k = s.length();
        for (int m = 0; m < k/2 + 1; m++){
            if (s.charAt(m)!=s.charAt(k-m-1)){
                return false;
            }
        }
        return true;
    }

    // �����ύʱ�� 20190514
    // ����ʱ�� 65ms ���� 5.31% �û�
    // �����ڴ� 39.4MB ���� 15.19% �û�
    public static void main(String[] args) {
        System.out.println(String.valueOf((char)97));
    }
}
