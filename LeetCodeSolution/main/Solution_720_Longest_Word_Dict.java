import java.util.*;

public class Solution_720_Longest_Word_Dict {
    public String longestWord(String[] words) {
        int ini = 1;
        int len = words.length;
        List<List<String>> store = new ArrayList<>();
        while (ini <= words.length){
            List<String> thisStore = new ArrayList<>();
            for (String str:words){
                if (str.length()==ini){
                    thisStore.add(str);
                }
            }
            if (thisStore.size()==0){
                break;
            }else{
                store.add(thisStore);
            }
            ini++;
        }
        // 接下来开始filter
        if (store.size()==0){return "";}
        int rini = 1;
        int rlen = store.size();
        while (rini < rlen){
            List<String> thisList = store.get(rini);
            List<String> newList = new ArrayList<>();
            for (String str:thisList){
                if (store.get(rini-1).contains(str.substring(0,rini))){
                    newList.add(str);
                }
            }
            if (newList.size()==0){
                store = store.subList(0,rini);
                break;
            }else{
                store.set(rini,newList);
            }
            rini++;
        }
        List<String> res = store.get(store.size()-1);
        Collections.sort(res);
        return res.get(0);
    }

    public static void main(String[] args) {
        Solution_720_Longest_Word_Dict sol = new Solution_720_Longest_Word_Dict();
        String[] words = {"a","banana","app","appl","ap","apply","apple"};
        System.out.println(sol.longestWord(words));
    }
    // 最终提交时间 20190614
    // 最终运行时间 23ms 超过 31.19% 用户
    // 最终运行内存 39.4MB 超过 56.41% 用户
}
