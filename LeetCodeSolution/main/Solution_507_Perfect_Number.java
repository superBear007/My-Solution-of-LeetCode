public class Solution_507_Perfect_Number {
    public boolean checkPerfectNumber(int num) {
        if (num <= 0){return false;}
        int m = (int) Math.sqrt(num);
        int sum = 1;
        for (int k = 2; k <= m; k++){
            if (num%k==0){
                sum = sum + k + num/k;
            }
        }
        if (num == m*m) {
            sum = sum - m;
        }
        return num==sum;
    }

    public static void main(String[] args) {
        Solution_507_Perfect_Number sol = new Solution_507_Perfect_Number();
        System.out.println(sol.checkPerfectNumber(6));
    }
    // 最终提交时间 20190601
    // 最终运行时间 1ms 超过 98.05% 用户
    // 最终运行内存 32.3MB 超过 61.87% 用户
}
