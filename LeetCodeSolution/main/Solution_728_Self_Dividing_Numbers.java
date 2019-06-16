import java.util.ArrayList;
import java.util.List;

public class Solution_728_Self_Dividing_Numbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        while (left <= right){
            if (isSelfDividing(left)){
                res.add(left);
            }
            left++;
        }
        return res;
    }
    public boolean isSelfDividing(int num){
        int numk = num;
        while (num > 9){
            int a = num % 10;
            if (a==0 || numk % a != 0){
                return false;
            }
            num = num/10;
        }
        if (numk % num != 0){
            return false;
        }else{
            return true;
        }
    }
    // �����ύʱ�� 20190614
    // ��������ʱ�� 1ms ���� 100.00% �û�
    // ���������ڴ� 33.8MB ���� 59.40% �û�
}
