public class Solution_443_String_Compression {
    public int compress(char[] chars) {
       // 压缩不止出现一次的字符，计算压缩过后的字符串长度。
        int len = chars.length;
        if (len == 1){return 1;}
        String res = "";
        int ind = 1;
        for (int i = 1; i < len; i++){
            if (chars[i]==chars[i-1]){
                ind++;
            }else{
                res = res + chars[i-1];
                if (ind>1){
                    res = res+ind;
                }
                ind = 1;
            }
        }
            res = res + chars[len-1];
            if (ind > 1) {
                res = res + ind;
            }
        int m = res.length();
        for (int i = 0; i < m; i++){
            chars[i] = res.charAt(i);
        }
        return m;
    }
    // 最终提交 20190526
    // 运行时间 4ms 超过 12.01% 用户
    // 运行内存 36MB 超过 99.59% 用户
    public static void main(String[] args) {
        Solution_443_String_Compression sol = new Solution_443_String_Compression();
        char[] schr = {'a','a','b','b','c','c','c'};
        System.out.println(sol.compress(schr));
    }
}
