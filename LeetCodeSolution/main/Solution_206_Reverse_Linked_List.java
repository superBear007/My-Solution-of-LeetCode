import entity.ListNode;

import java.util.List;

public class Solution_206_Reverse_Linked_List {
    // ����ת
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
    // �����ύʱ�� 20190518
    // ����ʱ�� 0ms ���� 100% �û�
    // �����ڴ� 36MB ���� 99.82% �û�
}
