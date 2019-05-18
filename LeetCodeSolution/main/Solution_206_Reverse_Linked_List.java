import entity.ListNode;

import java.util.List;

public class Solution_206_Reverse_Linked_List {
    // 链表反转
    public ListNode reverseList(ListNode head){
        ListNode res = null;
        while (head!=null){
            ListNode node = new ListNode(head.val);
            node.next = res;
            res = node;
            head = head.next;
        }
        return res;
    }
    // 最终提交时间 20190518
    // 运行时间 0ms 超过 100% 用户
    // 运行内存 36MB 超过 99.82% 用户
}
