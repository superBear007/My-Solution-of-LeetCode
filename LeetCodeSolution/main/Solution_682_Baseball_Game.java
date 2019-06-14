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
    // 最终提交时间 20190613
    // 最终运行时间 3ms 超过 64.15% 用户
    // 运行内存 35.7MB 超过 99.04% 用户
}
