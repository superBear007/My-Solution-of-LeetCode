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
    // 最终提交时间 20190515
    // 运行时间 1ms 超过 97.74% 用户
    // 运行内存 37.5MB 超过 55.03% 用户
}
