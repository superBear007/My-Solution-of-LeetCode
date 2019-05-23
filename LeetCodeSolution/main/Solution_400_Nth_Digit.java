public class Solution_400_Nth_Digit {
    public int findNthDigit(int n) {
        // 1 位 9
        // 2 位 90
        // 3 位 900
        long n0 = n;
        long ind = 1;
        long pow = 1;
        while (n0 > ind * 9 * pow){
            n0 = n0 - ind * 9 * pow;
            ind = ind + 1;
            pow = pow * 10;
        }
        int a = (int)((n0-1)/ind);
        int b = (int)((n0-1)%ind + 1);
        String real = String.valueOf(pow + a);
        return Integer.valueOf(real.substring(b-1,b));
    }

    public static void main(String[] args) {
        Solution_400_Nth_Digit sol = new Solution_400_Nth_Digit();
        System.out.println(sol.findNthDigit(11));
    }
    // 最终提交时间 20190523
    // 运行时间 0ms 超过 100% 用户
    // 运行内存 32.3MB 超过 59.27% 用户
}
