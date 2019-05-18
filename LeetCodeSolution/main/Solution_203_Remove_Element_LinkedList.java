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
    // �����ύʱ�� 20190518
    // ����ʱ�� 1ms ������ 99.53% �û�
    // �����ڴ� 38.8MB ������ 98.61% �û�
}
