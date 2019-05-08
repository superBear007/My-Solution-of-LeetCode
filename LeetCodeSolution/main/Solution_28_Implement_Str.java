public class Solution_28_Implement_Str {
    public int strStr(String haystack, String needle) {
        int len0 = needle.length();
        int len1 = haystack.length();
        if (haystack.equals(needle)){return 0;}
        if (len1 < len0){return -1;}
        for (int i = 0; i < len1 - len0 + 1; i++){
            if (haystack.substring(i,i+len0).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "pi";
        Solution_28_Implement_Str sol = new Solution_28_Implement_Str();
        System.out.println(sol.strStr(haystack,needle));
    }

    // 最终提交时间为 20190508
    // 运行时间 0ms 超过 100% 用户
    // 运行内存 36.7MB 超过 91.30% 用户
}
