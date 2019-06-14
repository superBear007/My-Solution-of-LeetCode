public class Solution_686_Repeated_String_Match {
    public int repeatedStringMatch(String A, String B) {
        String tmp = A;
        int len = A.length();
        int ini = 1;
        while (ini <= 5000/len){
            if (A.contains(B)){
                return ini;
            }
            A = A.concat(tmp);
            ini++;
        }
        return -1;
    }
    // 最终提交时间 20190613
    // 运行时间 647ms 超过 5.03% 用户
    // 运行内存 37MB 超过 98.34% 用户
}
