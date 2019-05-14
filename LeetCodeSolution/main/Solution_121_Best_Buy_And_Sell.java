public class Solution_121_Best_Buy_And_Sell {
    public int maxProfit(int[] prices) {
         if (prices.length == 0){return 0;}
         int minPrice = prices[0];
         int maxProfit = 0;
         for (int m = 1; m < prices.length; m++){
             if (prices[m] > minPrice){
                 maxProfit = maxProfit < (prices[m] - minPrice)?(prices[m] - minPrice):maxProfit;
             }
             minPrice = minPrice < prices[m]? minPrice:prices[m];
         }
         return maxProfit;
    }
    // 最终提交时间 20190514
    // 运行时间 1ms 超过了 80.37% 用户
    // 运行内存 36.9MB 超过了 81.38% 用户
}
