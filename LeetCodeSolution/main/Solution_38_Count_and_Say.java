public class Solution_38_Count_and_Say {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String strLag = countAndSay(n - 1);
        String finalStr = "";
        int len = strLag.length();
        int ind = 1;
        for (int i = 0; i < len - 1; i++) {
            if (strLag.charAt(i) == strLag.charAt(i + 1)) {
                ind++;
            } else {
                finalStr = finalStr.concat(ind + strLag.substring(i, i + 1));
                ind = 1;
            }
        }
        finalStr = finalStr.concat(ind + strLag.substring(len - 1, len));
        return finalStr;
    }

    public static void main(String[] args) {
        Solution_38_Count_and_Say sol = new Solution_38_Count_and_Say();
        System.out.println(sol.countAndSay(6));
    }

    // 最终提交时间 20190509
    // 运行时间 4ms 超过 34.60% 用户 (效率太低)
    // 运行内存 35.1MB 超过 99.84% 用户
}
