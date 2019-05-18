import java.util.ArrayList;
import java.util.List;

public class Solution_202_Happy_Number {
    List<Integer> mylist = new ArrayList<>();
    // 各个位数的平方和最终等于1
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
    // 最终提交时间 20190518
    // 最终运行时间 1ms 超过了 89.86% 用户
    // 最终运行内存 32.6MB 超过了 47.51% 用户
}
