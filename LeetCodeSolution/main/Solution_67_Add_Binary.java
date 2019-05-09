public class Solution_67_Add_Binary {
    public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int maxLen = lenA>lenB?lenA:lenB;
        String resStr = "";
        int ind = 0;
        int thisInt;
        for (int m = 0; m < maxLen; m++){
            if (lenA - m - 1 >= 0 & lenB - m - 1 >= 0){
                thisInt = Integer.valueOf(a.substring(lenA - m - 1, lenA - m)) + Integer.valueOf(b.substring(lenB - m - 1, lenB - m)) + ind;
            }else if (lenA - m - 1 < 0){
                thisInt = Integer.valueOf(b.substring(lenB - m - 1, lenB - m)) + ind;
            }else{
                thisInt = Integer.valueOf(a.substring(lenA - m - 1, lenA - m))+ ind;
            }
            if (thisInt > 1){
                resStr = thisInt - 2 + resStr;
                ind = 1;
            }else{
                resStr = thisInt + resStr;
                ind = 0;
            }
        }
        if (ind == 0){
            return resStr;
        }else{
            return "1"+ resStr;
        }
    }
    // 最终提交时间为 20190509
    // 运行时间为 5ms 超过 6.84% 用户
    // 运行内存为 35.5MB 超过 63.56% 用户
    // PS 有点水
}
