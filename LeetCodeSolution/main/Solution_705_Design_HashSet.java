import java.util.ArrayList;
import java.util.List;

public class Solution_705_Design_HashSet {
}

class MyHashSet {
    List<Integer> res;
    /** Initialize your data structure here. */
    public MyHashSet() {
        res = new ArrayList<>();
    }

    public void add(int key) {
        if (!res.contains(key)){
            res.add(key);
        }
    }

    public void remove(int key) {
        res.remove(Integer.valueOf(key));
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return res.contains(Integer.valueOf(key));
    }
    // 最终提交时间 20190614
    // 最终运行时间 347ms 超过 5.00% 用户
    // 最终运行内存 63.4MB 超过 12.73% 用户
}
