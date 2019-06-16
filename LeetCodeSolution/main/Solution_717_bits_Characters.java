public class Solution_717_bits_Characters {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        int ini = 0;
        while (ini < len - 1){
            if (bits[ini] == 0){
                ini++;
            }else{
                ini = ini + 2;
            }
        }
        return ini == len-1;
    }
    // 最终提交时间 20190614
    // 最终运行时间 0ms 超过 100% 用户
    // 最终运行内存 36.6MB 超过 100% 用户
}
