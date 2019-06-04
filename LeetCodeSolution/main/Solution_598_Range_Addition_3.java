public class Solution_598_Range_Addition_3 {
    public int maxCount(int m, int n, int[][] ops) {
        int a = m;
        int b = n;
        for (int[] k : ops){
            a = Math.min(a,k[0]);
            b = Math.min(b,k[1]);
        }
        return a*b;
    }
    // 最终提交时间 20190604
    // 运行时间 0ms，超过 100.00% 用户
    // 运行内存 37.1MB, 超过 99.14% 用户
}
