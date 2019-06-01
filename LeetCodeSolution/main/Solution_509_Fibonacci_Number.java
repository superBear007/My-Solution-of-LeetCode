public class Solution_509_Fibonacci_Number {
    public int fib(int N) {
        if (N==0){return 0;}
        if (N==1){return 1;}
        int one = 1;
        int two = 0;
        int i = 2;
        int m = 0;
        while (i <= N){
            m = one + two;
            two = one;
            one = m;
            i++;
        }
        return m;
    }

    public static void main(String[] args) {
        Solution_509_Fibonacci_Number sol = new Solution_509_Fibonacci_Number();
        System.out.println(sol.fib(4));
    }
    // 最终提交时间 20190601
    // 运行时间 0ms 超过了 100.00% 用户
    // 运行内存 32MB 超过 53.95% 用户
}
