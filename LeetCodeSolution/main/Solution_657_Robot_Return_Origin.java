public class Solution_657_Robot_Return_Origin {
    public boolean judgeCircle(String moves) {
        int lr = 0;
        int ud = 0;
        int len = moves.length();
        for (int i = 0; i < len; i++){
            if (moves.charAt(i)=='U'){
                ud++;
            }
            if (moves.charAt(i)=='D'){
                ud--;
            }
            if (moves.charAt(i)=='L'){
                lr++;
            }
            if (moves.charAt(i)=='R'){
                lr--;
            }
        }
        return lr==0 && ud==0;
    }
    // �����ύʱ�� 20190612
    // ����ʱ�� 13ms ���� 16.24% �û�
    // �����ڴ� 36.6MB ���� 99.84% �û�
}
