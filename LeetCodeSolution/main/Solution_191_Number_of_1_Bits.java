public class Solution_191_Number_of_1_Bits {
    // 二进制位数中1的数量
    public int hamminWeight(int n){
        int count = 0;
        while (n!=0){
            count = count + (n&1);
            n >>>=1;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution_191_Number_of_1_Bits sol = new Solution_191_Number_of_1_Bits();
        System.out.println(sol.hamminWeight(00000000000000000000000000001011));
    }
    /// 最终提交时间 20190518
    /// 运行时间 0ms 超过 100% 用户
    /// 运行内存 32.3MB 超过 46.17% 用户
}
