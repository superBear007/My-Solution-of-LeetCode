import java.util.HashMap;
import java.util.Map;

public class Solution_168_Excel_Sheet {
    public String convertToTitle(int n) {
        Map<Integer,String> tran = new HashMap<>();
        String res = "";
        for (int i = 1; i < 27; i++){
            tran.put(i,String.valueOf((char)('A'+i-1)));
        }
        while (n > 26){
            res = tran.get((n-1)%26 + 1) + res;
            n = (n-1)/26;
        }
        res = tran.get(n) + res ;
        return res;
    }
    // �����ύʱ�� 20190515
    // ��������ʱ�� 0ms ���� 100% �û�
    // �����ڴ� 32.7MB ���� 100% �û�
    // PS: ����ͨ���ˣ������Ŀ��ʮ���Ƶ�����춼û�ƹ���

    public static void main(String[] args) {
        Solution_168_Excel_Sheet sol = new Solution_168_Excel_Sheet();
        System.out.println(sol.convertToTitle(701));
    }
}
