import java.util.ArrayList;
import java.util.List;

public class Solution_706_Design_HashMap {
}

class MyHashMap {
    List<Integer> keyList;
    List<Integer> valueList;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        keyList = new ArrayList<>();
        valueList = new ArrayList<>();
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        if (keyList.contains(Integer.valueOf(key))) {
            valueList.set(keyList.indexOf(Integer.valueOf(key)), Integer.valueOf(value));
        } else {
            keyList.add(Integer.valueOf(key));
            valueList.add(Integer.valueOf(value));
        }
        return;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        if (keyList.contains(Integer.valueOf(key))) {
            return (int) valueList.get(keyList.indexOf(Integer.valueOf(key)));
        } else {
            return -1;
        }
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        if (keyList.contains(Integer.valueOf(key))) {
            int ind = keyList.indexOf(Integer.valueOf(key));
            keyList.remove(ind);
            valueList.remove(ind);
        }
        return;
    }
    // 最终提交时间 20190614
    // 最终运行时间 122ms 超过 7.63% 用户
    // 最终运行内存 53.9MB 超过 50.64% 用户
}
