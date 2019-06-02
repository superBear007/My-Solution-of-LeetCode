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
    // 最终提交时间 20190602
    // 运行时间 41ms 超过 66.23% 用户
    // 运行内存 40.1MB 超过 99.54% 用户
}
