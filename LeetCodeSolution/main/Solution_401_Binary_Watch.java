import java.util.ArrayList;
import java.util.List;

public class Solution_401_Binary_Watch {
    public List<String> readBinaryWatch(int num) {
        String str;
        List<String> mylist = new ArrayList<>();
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 60; j++){
                if (oneCount(i) + oneCount(j) == num){
                    str = ""+i+":"+(j>9?String.valueOf(j):("0"+String.valueOf(j)));
                    mylist.add(str);
                }
            }
        }
        return mylist;
    }
    public int oneCount(int num){
        int count = 0;
        while (num>0){
            count = count + (num&1);
            num>>=1;
        }
        return count;
    }
    // 最终提交时间 20190523
    // 运行时间 1ms 超过 95.11% 用户
    // 运行内存 34.2MB 超过100.00% 用户
}
