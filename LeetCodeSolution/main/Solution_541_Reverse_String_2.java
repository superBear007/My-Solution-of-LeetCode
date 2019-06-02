public class Solution_541_Reverse_String_2 {
    public String reverseStr(String s,int k){
        String res = "";
        int len = s.length();
        int ind = 0;
        while (len >= ind + 2*k){
            res = res + new StringBuilder(s.substring(ind,ind+k)).reverse().toString();
            res = res + s.substring(ind+k,ind+2*k);
            ind = ind + 2*k;
        }
        if (len >= ind + k){
            res = res + new StringBuilder(s.substring(ind,ind+k)).reverse().toString();
            res = res + s.substring(ind+k);
        }else{
            res = res + new StringBuilder(s.substring(ind)).reverse().toString();
        }
        return res;
    }
    // 最终提交时间 20190602
    // 运行时间 2ms 超过 48.97% 用户
    // 运行内存 37.2MB 超过 100.00% 用户
}
