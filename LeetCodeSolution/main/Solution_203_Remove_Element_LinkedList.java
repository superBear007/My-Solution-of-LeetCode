import entity.ListNode;

import java.util.HashMap;
import java.util.List;

public class Solution_203_Remove_Element_LinkedList {
    public ListNode removeElements(ListNode head, int val){
        ListNode res1 = new ListNode(0);
        ListNode res0 = new ListNode(0);
        res1.next = res0;
        while (head!=null){
            if (head.val!=val){
                res0.next = new ListNode(head.val);
                res0 = res0.next;
            }
            head = head.next;
        }
        return res1.next.next;
    }
    // 最终提交时间 20190518
    // 运行时间 1ms 超过了 99.53% 用户
    // 运行内存 38.8MB 超过了 98.61% 用户
}
