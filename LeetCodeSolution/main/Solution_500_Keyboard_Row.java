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
    // �����ύʱ�� 20190530
    // ����ʱ�� 1ms ������ 84.61% �û�
    // �����ڴ� 34MB ������ 99.93% �û�
}
