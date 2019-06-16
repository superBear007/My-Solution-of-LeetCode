public class Solution_796_Rotate_String {
    public boolean rotateString(String A, String B) {
        if (A.length()!=B.length()){
            return false;
        }
        return (A + A).contains(B);
    }
    // 最终提交时间 20190616
    // 最终运行时间 0ms 超过 100% 用户
    // 最终运行内存 34.3MB 超过 100% 用户
}
