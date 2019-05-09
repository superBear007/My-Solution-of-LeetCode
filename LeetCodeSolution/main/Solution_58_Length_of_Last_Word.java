public class Solution_58_Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        int lenS = s.split(" ").length;
        if (lenS > 0){
            return s.split(" ")[lenS-1].length();
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution_58_Length_of_Last_Word sol = new Solution_58_Length_of_Last_Word();
        String s = "Hello World";
        System.out.println(sol.lengthOfLastWord(s));
    }

    // 最终提交时间为 20190509
    // 运行时间 2ms ，超过 63.52% 用户
    // 运行内存 34.8MB, 超过 76.89% 用户
}
