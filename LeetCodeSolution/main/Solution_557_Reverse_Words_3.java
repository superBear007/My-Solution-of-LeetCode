public class Solution_557_Reverse_Words_3 {
    public String reverseWords(String s){
        String[] res = s.split(" ");
        int len = res.length;
        for (int m = 0; m < len; m++){
            res[m] = new StringBuilder(res[m]).reverse().toString();
        }
        return String.join(" ",res);
    }
    // �ύʱ�� 20190602
    // ����ʱ�� 4ms ���� 88.66% �û�
    // �����ڴ� 36.2MB ����99.97% �û�
}
