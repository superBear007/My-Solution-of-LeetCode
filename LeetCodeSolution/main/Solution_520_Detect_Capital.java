public class Solution_520_Detect_Capital {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if (len==1){return true;}
        if (word.charAt(0)<='z'&&word.charAt(0)>='a'){
            for (int m = 1; m < len; m++){
                if (word.charAt(m)>'z' || word.charAt(m)<'a'){
                    return false;
                }
            }
            return true;
        }else{
            String str = word.substring(1);
            if (str.equals(str.toLowerCase()) || str.equals(str.toUpperCase())) {
                return true;
            }
            return false;
        }
    }
    // 最终提交时间 20190601
    // 运行时间 1ms 超过 100.00% 用户
    // 运行内存 34.1MB 超过 100.00% 用户
}
