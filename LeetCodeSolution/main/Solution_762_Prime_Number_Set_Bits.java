public class Solution_762_Prime_Number_Set_Bits {
    public int countPrimeSetBits(int L, int R) {
        int cnt = 0;
        while (L <= R){
            if (isPrime(countBits(L))){
                cnt++;
            }
            L++;
        }
        return cnt++;
    }
    public int countBits(int num){
        int cnt = 0;
        while (num > 0){
            int a = num & 1;
            cnt = cnt + a;
            num >>=1;
        }
        return cnt;
    }
    public boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        if (n == 2){
            return true;
        }
        for (int m = 2; m < (int)(Math.sqrt(n) + 1); m++){
            if (n % m == 0){
                return false;
            }
        }
        return true;
    }
    // 最终提交时间 20190615
    // 最终运行时间 10ms 超过 56.87% 用户
    // 最终运行内存 33.4MB 超过 49.62% 用户
}
