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
    // 最终提交时间 20190614
    // 最终运行时间 1ms 超过 100.00% 用户
    // 最终运行内存 33.8MB 超过 59.40% 用户
}
