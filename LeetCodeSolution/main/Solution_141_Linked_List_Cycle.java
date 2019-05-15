import entity.ListNode;

public class Solution_141_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next != null && fast.next.next != null && slow != fast){
            // fastÿ�ζ����slow����һ��Ҫôfast���޿��ܣ�Ҫôslow==fast
            // �������ѭ��
            fast = fast.next.next;
            slow = slow.next;
        }
        return fast == slow;
    }
    // �����ύʱ�� 20190515
    // ����ʱ�� 0ms ������ 100% ���û�
    // �����ڴ� 35.3MB ������ 99.63% ���û�
    // PS: �����Ŀ��������������ǡ���һ��ʼ���������ǲ�������һ�����
}
