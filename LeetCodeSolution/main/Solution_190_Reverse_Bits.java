public class Solution_190_Reverse_Bits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;
            if (i < 31) {
                result <<= 1;
            }
        }
        return result;
    }
    // 最终提交时间 20190516
    // 运行时间 0ms 超过了 99.98% 用户
    // 运行内存 28.4MB 超过了 16.86% 用户
}
