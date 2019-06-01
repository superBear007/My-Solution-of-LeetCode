public class Solution_504_Base_7 {
    public String convertToBase7(int num) {
        int ind = 0;
        String res = "";
        if (num<0){
            ind = 1;
            num = -1 * num;
        }
        while (num > 6){
            res = num%7 + res;
            num = num/7;
        }
        res = num + res;
        if (ind == 1){
            res = "-" + res;
        }
        return res;
    }
    // 最终提交时间 20190601
    // 运行时间 1ms 超过了 96.41% 用户
    // 运行内存 33.3MB 超过 100.00% 用户
}
