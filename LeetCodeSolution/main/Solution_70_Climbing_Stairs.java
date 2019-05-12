public class Solution_70_Climbing_Stairs {
    public int climbStairs(int n) {
        if (n < 4){
            return n;
        }else{
            int one = 3;
            int two = 2;
            int m = 3;
            int cur = 3;
            while (m++ < n){
                cur = one + two;
                two = one;
                one = cur;
            }
            return cur;
        }
    }

    public static void main(String[] args) {
        Solution_70_Climbing_Stairs sol = new Solution_70_Climbing_Stairs();
        System.out.println(sol.climbStairs(37));
    }
    // 最终提交时间为20190512
    // 运行时间为 0ms 超过了 100% 用户
    // 运行内存为 32.2MB 超过了 100% 用户
    // PS：同样的思路，一开始用递归，显示超出运行时间，而后选择直接走循环，
    // 可见递归虽然好，但是效率不一定高
}
