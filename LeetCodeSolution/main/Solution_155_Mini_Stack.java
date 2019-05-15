import java.util.ArrayList;
import java.util.List;

public class Solution_155_Mini_Stack {
}
class MinStack{
    /** initialize your data structure here. */
    List<Integer> mylist;
    public MinStack() {
        mylist = new ArrayList<>();
    }

    public void push(int x) {
        mylist.add(x);
    }

    public void pop() {
        int len = mylist.size();
        mylist = mylist.subList(0,len-1);
    }

    public int top() {
        int len = mylist.size();
        return mylist.get(len-1);
    }

    public int getMin() {
        int minVal = Integer.MAX_VALUE;
        for (int k : mylist){
            minVal = minVal > k ? k:minVal;
        }
        return minVal;
    }
    // 最终提交时间 20190515
    // 运行时间 290ms 超过 5.02% 用户
    // 运行内存 55.8MB 超过 5.01% 用户
}
