import org.w3c.dom.css.Counter;

import java.util.HashMap;
import java.util.Map;

public class Solution_748_Shortest_Completing_Word {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String str = licensePlate.toLowerCase();
        int minlen = Integer.MAX_VALUE;
        String newstr = "";
        for (int m = 0; m < str.length(); m++){
            if (str.charAt(m)<='z' && str.charAt(m)>='a'){
                newstr = newstr + str.charAt(m);
            }
        }
        Map<String,Integer> mapstr = strToDict(newstr);
        int len = words.length;
        int ind = -1;
        for (int k = 0; k < len; k++){
            if (isSub(mapstr,strToDict(words[k]))&&words[k].length()<minlen){
                minlen = words[k].length();
                ind = k;
            }
        }
        return words[ind];
    }
    public Map<String,Integer> strToDict(String str){
        int len = str.length();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++){
            if (map.keySet().contains(str.substring(i,i+1))){
                map.put(str.substring(i,i+1),map.get(str.substring(i,i+1))+1);
            }else{
                map.put(str.substring(i,i+1),1);
            }
        }
        return map;
    }
    public boolean isSub(Map<String,Integer> map1,Map<String,Integer> map2){
        for (String str : map1.keySet()){
            if (!map2.containsKey(str) || map2.get(str) < map1.get(str)){
                return false;
            }
        }
        return true;
    }
    // 最终提交时间 20190615
    // 最终运行时间 15ms 超过 18.82% 用户
    // 最终运行内存 39.2MB 超过 76.30% 用户
}
