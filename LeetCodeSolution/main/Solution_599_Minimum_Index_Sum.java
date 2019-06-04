import java.util.ArrayList;
import java.util.List;

public class Solution_599_Minimum_Index_Sum {
    public String[] findRestaurant(String[] list1, String[] list2) {
         int len1 = list1.length;
         int len2 = list2.length;
         List<String> res = new ArrayList<>();
         for (int i = 0; i < len1+len2-1; i++){
             for (int j = Math.max(0,i - len2 + 1); j <= Math.min(i,len1-1); j++){
                 if (list1[j].equals(list2[i-j])){
                     res.add(list1[j]);
                 }
             }
             if (res.size()!=0){
                 String[] str = new String[res.size()];
                 for (int p = 0; p < res.size(); p++){
                     str[p] = res.get(p);
                 }
                 return str;
             }
         }
         return new String[]{list1[0]};
    }
    // 运行时间 42ms ，超过 13.60% 用户
    // 运行内存 47.3MB, 超过 5.04% 用户
}
