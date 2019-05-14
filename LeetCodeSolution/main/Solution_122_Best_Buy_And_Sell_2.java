public class Solution_122_Best_Buy_And_Sell_2 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2){
            return 0;
        }
        int buyIndex = 0;
        int maxProfit = 0;
        int sellIndex = 1;
        while (buyIndex < prices.length - 1){
            if (prices[buyIndex] < prices[buyIndex + 1]){
                sellIndex = buyIndex + 1;
                while (sellIndex < prices.length - 1 && prices[sellIndex] < prices[sellIndex + 1]){
                    sellIndex ++;
                }
                maxProfit = maxProfit + prices[sellIndex] - prices[buyIndex];
                buyIndex = sellIndex + 1;
            }else {
                buyIndex++;
            }
        }
        return maxProfit;
    }
    // 最终提交时间 20190514
    // 运行时间 1ms 超过 81.27% 用户
    // 运行内存 36.6MB 超过 84.95% 用户
}
