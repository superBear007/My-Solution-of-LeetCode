import entity.ListNode;

public class Solution_83_Remove_Duplicates_LinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode next = deleteDuplicates(head.next);
        if (head.next.val != head.val){
            head.next = next;
            return head;
        }else{
            head.next = next.next;
            return head;
        }
        // 最终提交时间为 20190512
        // 运行时间 0ms 超过 100% 用户
        // 运行内存 35.6MB 超过 98.68% 用户
        // 感悟: 像链表这种题目，可以尽量交给递归来做，递归适合于专门
        // 做这种脏活累活
    }
}
