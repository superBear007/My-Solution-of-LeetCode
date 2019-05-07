public class Solution_6_Zigzag_Conversion {
    public String convert(String s, int numRows) {
        String result = "";
        int len = s.length();
        if (numRows == 1){return s;}
        for (int i = 0; i < numRows; i++){
            int j = i;
            String thisStr = "";
            if (j == 0 || j == numRows - 1){
                while (j < len){
                    thisStr = thisStr.concat(s.substring(j,j+1));
                    j = j + 2 * numRows-2;
                }
            }else{
                int ind = 0;
                while (j < len){
                    thisStr = thisStr.concat(s.substring(j,j+1));
                    if (ind%2==0){
                        j = j + 2 * (numRows - i - 1);
                    }else{
                        j = j + 2 * i;
                    }
                    ind++;
                }
            }
            result = result.concat(thisStr);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "A";
        int num = 1;
        Solution_6_Zigzag_Conversion sol = new Solution_6_Zigzag_Conversion();
        System.out.println(sol.convert(s,num));
        // "PAHNAPLSIIGYIR"
    }
    // 最终提交时间 20190507
    // 运行时间 15ms 超过 71.41% 用户
    // 运行内存 39.2M 超过 90.20% 用户
}
