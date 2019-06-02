import java.util.HashSet;
import java.util.Set;

public class Solution_575_Distribute_Candies {
    public int distributeCandies(int[] candies){
        Set<Integer> res = new HashSet<>();
        for (int m:candies){
            res.add(m);
        }
        return Math.min(res.size(),candies.length/2);
    }
    // �����ύʱ�� 20190602
    // ����ʱ�� 41ms ���� 66.23% �û�
    // �����ڴ� 40.1MB ���� 99.54% �û�
}
