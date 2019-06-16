public class Solution_693_Alternating_Bits {
    public boolean hasAlternatingBits(int n) {
        char[] str = Integer.toBinaryString(n).toCharArray();
        int len = str.length;
        for (int m = 0; m < len - 1; m++){
            if (str[m] == str[m+1]){
                return false;
            }
        }
        return true;
    }
    // 最终提交时间 20190614
    // 运行时间 1ms 超过 44.77% 用户
    // 运行内存 33.1MB 超过 38.78% 用户
}
