public class Solution_7_Reverse_Integer {
    public int reverse(int x) {
        String str = String.valueOf(x);
        String result;
        if (str.charAt(0)=='-'){
            result = "-" + new StringBuilder(str.substring(1)).reverse().toString();
        }else{
            result = new StringBuilder(str).reverse().toString();
        }
        long res = Long.valueOf(result);
        if (res <= Math.pow(2,31) - 1 & res >= -1 * Math.pow(2,31)){
            return (int)res;
        }else {
            return 0;
        }
    }

    // 最终提交时间为20190507
    // 执行时间为3ms ，超过 66.99% 的用户
    // 执行内存 33.1M, 超过 100% 的用户
}
