import java.util.ArrayList;
import java.util.List;

public class Solution_119_Pascals_Triangle_2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++){
            list.add(comCalc(rowIndex,i));
        }
        return list;
    }
    public int comCalc(int n,int m){
        if (n < 2*m){
            m = n - m;
        }
        long res = 1;
        for (int i = 1; i <= m; i++){
            res = res * (n - i + 1)/i;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        Solution_119_Pascals_Triangle_2 sol = new Solution_119_Pascals_Triangle_2();
        System.out.println(sol.comCalc(30,15));
    }
    // �����ύʱ�� 20190513
    // ����ʱ�� 0ms ���� 100% ���û�
    // �����ڴ� 32.7MB ��� 100% ���û�
}
