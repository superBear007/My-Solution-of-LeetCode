public class Solution_557_Reverse_Words_3 {
    public String reverseWords(String s){
        String[] res = s.split(" ");
        int len = res.length;
        for (int m = 0; m < len; m++){
            res[m] = new StringBuilder(res[m]).reverse().toString();
        }
        return String.join(" ",res);
    }
    // 提交时间 20190602
    // 运行时间 4ms 超过 88.66% 用户
    // 运行内存 36.2MB 超过99.97% 用户
}
