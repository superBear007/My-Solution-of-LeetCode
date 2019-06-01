public class Solution_504_Base_7 {
    public String convertToBase7(int num) {
        int ind = 0;
        String res = "";
        if (num<0){
            ind = 1;
            num = -1 * num;
        }
        while (num > 6){
            res = num%7 + res;
            num = num/7;
        }
        res = num + res;
        if (ind == 1){
            res = "-" + res;
        }
        return res;
    }
    // �����ύʱ�� 20190601
    // ����ʱ�� 1ms ������ 96.41% �û�
    // �����ڴ� 33.3MB ���� 100.00% �û�
}
