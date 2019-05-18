public class Solution_204_Count_Primes {
    // ����С��n�����������ĸ���
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
    // �����ύʱ�� 20190518
    // ����ʱ�� 493ms ������ 14.09% �û�
    // �����ڴ� 71.8MB ������ 5.00% �û�
}
