public class Solution_204_Count_Primes {
    // 计算小于n的数里质数的个数
    public int countPrimes(int n){
        if (n<=2){return 0;}
        if (isPrime(n-1)){
            return countPrimes(n-1)+1;
        }else{
            return countPrimes(n-1);
        }
    }
    public boolean isPrime(int k){
        if (k <= 1){
            return false;
        }
        if (k == 2){
            return true;
        }
        int sqt = (int) Math.sqrt(k);
        for (int m = 2; m <= sqt; m++){
            if (k%m==0){
                return false;
            }
        }
        return true;
    }
    // 最终提交时间 20190518
    // 运行时间 493ms 超过了 14.09% 用户
    // 运行内存 71.8MB 超过了 5.00% 用户
}
