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
    // �����ύʱ�� 20190614
    // ��������ʱ�� 347ms ���� 5.00% �û�
    // ���������ڴ� 63.4MB ���� 12.73% �û�
}
