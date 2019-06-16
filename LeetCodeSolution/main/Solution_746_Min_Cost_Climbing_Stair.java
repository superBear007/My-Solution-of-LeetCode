public class Solution_746_Min_Cost_Climbing_Stair {
    public int minCostClimbingStairs(int[] cost) {
       int len = cost.length;
       int ini = 2;
       if (len <= 1){
           return 0;
       }
       int one = 0;
       int two = 0;
       int res = 0;
       while (ini <= len){
           res = Math.min(cost[ini-1] + one,cost[ini-2] + two);
           two = one;
           one = res;
       }
       return res;
    }
    // �����ύʱ�� 20190614
    // ��������ʱ�� 1ms ���� 99.98% �û�
    // ���������ڴ� 38.2MB ���� 93.76% �û�
}
