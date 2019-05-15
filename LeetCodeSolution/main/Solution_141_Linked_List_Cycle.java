import entity.ListNode;

public class Solution_141_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next != null && fast.next.next != null && slow != fast){
            // fast每次都会比slow多跑一格，要么fast跑无可跑，要么slow==fast
            // 即完成了循环
            fast = fast.next.next;
            slow = slow.next;
        }
        return fast == slow;
    }
    // 最终提交时间 20190515
    // 运行时间 0ms 超过了 100% 的用户
    // 运行内存 35.3MB 超过了 99.63% 的用户
    // PS: 这个题目的问题描述真的是。。一开始还在纳闷是不是少了一个入参
}
