import java.util.ArrayList;
import java.util.List;

public class Solution_682_Baseball_Game {
    public int calPoints(String[] ops) {
        List<String> op = new ArrayList<>();
        for (String str:ops){op.add(str);}
        int k = 0;
        while (k < op.size()){
            if ("C".equals(op.get(k))){
                op.remove(k);
                op.remove(k-1);
                k--;
            }else if ("D".equals(op.get(k))){
                op.set(k,""+2*Integer.valueOf(op.get(k-1)));
                k++;
            }else if ("+".equals(op.get(k))){
                op.set(k,Integer.valueOf(op.get(k-1)) +Integer.valueOf(op.get(k-2))+"");
                k++;
            }else{
                k++;
            }
        }
        int res = 0;
        for (String str:op){
            res = res + Integer.valueOf(str);
        }
        return res;
    }
    // �����ύʱ�� 20190613
    // ��������ʱ�� 3ms ���� 64.15% �û�
    // �����ڴ� 35.7MB ���� 99.04% �û�
}
