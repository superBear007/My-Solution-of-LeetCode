public class Solution_605_Can_Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        int len = flowerbed.length;
        if (len == 1){if (flowerbed[0]==0){return n <=1;}else{return n<=0;}}
        for (int i = 0; i < len; i++){
            if (flowerbed[i] == 0){
                if (i == 0){
                    if (flowerbed[i+1] == 0){
                        cnt++;
                        flowerbed[i] = 1;
                    }
                }else if (i == len-1){
                    if (flowerbed[i-1] == 0){
                        cnt++;
                        flowerbed[i] = 1;
                    }
                }else{
                    if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                        cnt++;
                        flowerbed[i] = 1;
                    }
                }
            }
        }
        return n <= cnt;
    }
    // 最后提交时间 20190611
    // 运行时间 1ms 超过 100.00% 用户
    // 运行内存 38.5MB 超过 99.62% 用户
}
