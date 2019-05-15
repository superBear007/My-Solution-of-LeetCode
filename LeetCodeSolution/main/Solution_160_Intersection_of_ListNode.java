import entity.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution_160_Intersection_of_ListNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode p1 = headA, p2 = headB;
            while(p1 != p2) {
                p1 = (p1 == null) ? headB : p1.next;
                p2 = (p2 == null) ? headA : p2.next;
            }
            return p1;
        }

    public static void main(String[] args) {
        ListNode l1 = ListNode.listToNode(new int[]{8,4,5});
        ListNode l2 = ListNode.listToNode(new int[]{8,4,5});
        System.out.println(l1 == l2);
    }
    // �����ύʱ�� 20190515
    // ����ʱ�� 1ms ���� 97.74% �û�
    // �����ڴ� 37.5MB ���� 55.03% �û�
}
