import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_438_Find_All_Anagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] freqs = new int[256];
        boolean[] exist = new boolean[256];
        int diff = p.length();
        int start = 0;
        int end = 0;

        if(s.length() < p.length()){
            return result;
        }

        for(int i=0; i<p.length(); i++){
            Character c = p.charAt(i);
            freqs[c-'a']++;
            exist[c-'a'] = true;
        }

        while(end < s.length()){
            char c = s.charAt(end);

            if(exist[c-'a'] && freqs[c-'a']>0){
                diff--;
                freqs[c-'a']--;
            }else if(!exist[c-'a']){
                while(start < end){
                    freqs[s.charAt(start) - 'a']++;
                    start++;
                    diff++;
                }
                start++;
            }else{
                while(s.charAt(start) != s.charAt(end)){
                    freqs[s.charAt(start) - 'a']++;
                    start++;
                    diff++;
                }
                start++;
            }
            end++;

            if(diff == 0){
                result.add(start);
                freqs[s.charAt(start) - 'a']++;
                start++;
                diff++;
            }
        }

        return result;
    }
    // �����ύʱ�� 20190526
    // ����ʱ�� 5ms ���� 99.33% �û�
    // �����ڴ� 37.8MB ���� 99.18% �û�
}
