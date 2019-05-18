import java.util.ArrayList;
import java.util.List;

public class Solution_202_Happy_Number {
    List<Integer> mylist = new ArrayList<>();
    // ����λ����ƽ�������յ���1
    public boolean isHappy(int n){
        if (n==1){
            return true;
        }
        if (mylist.contains(n)) {
            return false;
        }
        mylist.add(n);
        int res = 0;
        while (n > 0){
            int k = n%10;
            res = res + k*k;
            n = n/10;
        }
        return isHappy(res);
    }
    // �����ύʱ�� 20190518
    // ��������ʱ�� 1ms ������ 89.86% �û�
    // ���������ڴ� 32.6MB ������ 47.51% �û�
}
