public class Solution_754_Reach_A_Number {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int ini = 1;
        int sum = 1;
        while (sum < target){
            ini = ini + 1;
            sum = sum + ini;
        }
        while ((sum - target)%2!=0){
            ini = ini + 1;
            sum = sum + ini;
        }
        return ini;
    }
    // 最终提交时间 20190615
    // 最终运行时间 1ms 超过 91.67% 用户
    // 最终运行内存 32.9MB 超过 33.33% 用户
}
