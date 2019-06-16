import java.util.ArrayList;
import java.util.List;

public class Solution_707_Design_LinkedList {
    public static void main(String[] args) {
        // ["MyLinkedList","get","addAtIndex","get","get","addAtIndex","get","get"]
        // [[],[0],[1,2],[0],[1],[0,1],[0],[1]]
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.get(0));
        list.addAtIndex(1,2);
        System.out.println(list.get(0));
    }
}
class MyLinkedList {
    List<Integer> res;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        res = new ArrayList<>();
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
       if (index < 0 || index > res.size() - 1){
           return -1;
       }else{
           return res.get(index);
       }
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        res.add(0,Integer.valueOf(val));
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        res.add(Integer.valueOf(val));
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index >= 0 && index < res.size()) {
            res.add(index, Integer.valueOf(val));
        }else if(index == res.size()){
            res.add(Integer.valueOf(val));
        }else if (index < 0){
            res.add(0,Integer.valueOf(val));
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= 0 && index < res.size()) {
            res.remove(index);
        }
    }
    // 最终提交时间 20190614
    // 最终运行时间 49ms 超过 98.85% 用户
    // 最终运行内存 45MB 超过 94.07% 用户
}

