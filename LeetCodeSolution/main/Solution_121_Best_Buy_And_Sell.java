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
    // �����ύʱ�� 20190514
    // ����ʱ�� 1ms ������ 80.37% �û�
    // �����ڴ� 36.9MB ������ 81.38% �û�
}
