public class Solution_633_Sum_of_Square_Numbers {
    public boolean judgeSquareSum(int c) {
       int sqrtc = (int) Math.sqrt(c);
       for (int i = 0; i <= sqrtc; i++){
           int j = c - i*i;
           int k = (int)Math.sqrt(j);
           if (k*k==j){
               return true;
           }
       }
       return false;
    }
    // 最终提交时间 20190611
    // 最终运行时间 4ms 超过 66.27% 用户
    // 最终运行内存 33.3MB 超过 49.52% 用户
}
