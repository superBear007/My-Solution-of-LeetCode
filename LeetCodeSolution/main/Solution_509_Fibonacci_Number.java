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
    // �����ύʱ�� 20190601
    // ����ʱ�� 0ms ������ 100.00% �û�
    // �����ڴ� 32MB ���� 53.95% �û�
}
