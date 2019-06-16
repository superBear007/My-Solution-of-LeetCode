public class Solution_788_Rotated_Digits {
    public int rotatedDigits(int N) {
        int cnt = 0;
        int ini = 1;
        while (ini <= N){
            if (isRotated(ini)){
                cnt++;
            }
            ini++;
        }
        return cnt;
    }
    public boolean isRotated(int num){
        // 0,1,8 本身
        // 2 转化为 5
        // 6 转化为 9
        // 3,4,7 不合法
        String nstr = String.valueOf(num);
        if (nstr.contains("3") || nstr.contains("4") || nstr.contains("7")){
            return false;
        }
        String mstr = nstr.replace("2","a").replace("5","2").replace("a","5");
        mstr = mstr.replace("6","a").replace("9","6").replace("a","9");
        return !nstr.equals(mstr);
    }
    // 最终提交时间 20190616
    // 最终运行时间 67ms 超过 5.10% 用户
    // 最终运行内存 36.3MB 超过 30.31% 用户
}
