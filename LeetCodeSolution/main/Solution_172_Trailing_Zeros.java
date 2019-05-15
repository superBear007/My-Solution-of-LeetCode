public class Solution_172_Trailing_Zeros {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5){
            count = count + n/5;
            n = n/5;
        }
        return count;
    }
    // 最终提交时间 20190515
    // 最终运行时间 0ms 超过 100% 用户
    // 最终运行内存 32.3MB 超过 64.80% 用户
}
