public class Solution_441_Arranging_Coins {
    public int arrangeCoins(int n) {
        // 按照给定的整数，按照第一行1个，第二行2个。。。能排几行
        // 应满足 k^2 + k < n
        int res = (int)(Math.sqrt(2)*Math.sqrt(n + 0.125)-0.5);
        return res;
    }
    // 最终提交时间 20190526
    // 运行时间 1ms，超过 100% 用户
    // 运行内存 32.9MB, 超过 54.56% 用户
}
