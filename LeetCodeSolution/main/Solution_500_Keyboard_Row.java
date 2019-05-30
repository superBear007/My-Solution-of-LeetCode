import java.util.ArrayList;
import java.util.List;

public class Solution_500_Keyboard_Row {
    public String[] findWords(String[] words) {
        List<String> listStr = new ArrayList<>();
        for (String str:words){
            if (isTrue(str)){
                listStr.add(str);
            }
        }
        String[] res = new String[listStr.size()];
        for (int m = 0; m < listStr.size(); m++){
            res[m] = listStr.get(m);
        }
        return res;
    }
    public boolean isTrue(String word){
        String w = word.toLowerCase();
        if (w.length()==1){return true;}
        String[] cri = new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
        int m = 0;
        int len = w.length();
        int k = 1;
        while (!cri[m].contains(w.substring(0,1))){
            m++;
        }
        while (k < len){
            if (!cri[m].contains(w.substring(k,k+1))){
                return false;
            }
            k++;
        }
        return true;
    }
    // 最终提交时间 20190530
    // 运行时间 1ms 超过了 84.61% 用户
    // 运行内存 34MB 超过了 99.93% 用户
}
