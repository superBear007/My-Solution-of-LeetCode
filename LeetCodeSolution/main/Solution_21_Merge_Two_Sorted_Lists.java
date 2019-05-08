import entity.ListNode;

public class Solution_21_Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null & l2 == null){
            return null;
        }else if (l1 == null & l2 != null){
            ListNode thisNode = new ListNode(l2.val);
            thisNode.next = mergeTwoLists(l1,l2.next);
            return thisNode;
        }else if (l1 != null & l2 == null){
            ListNode thisNode = new ListNode(l1.val);
            thisNode.next = mergeTwoLists(l1.next,l2);
            return thisNode;
        }else{
            if (l1.val < l2.val){
                ListNode thisNode = new ListNode(l1.val);
                thisNode.next = mergeTwoLists(l1.next,l2);
                return thisNode;
            }else{
                ListNode thisNode = new ListNode(l2.val);
                thisNode.next = mergeTwoLists(l1,l2.next);
                return thisNode;
            }
        }
    }
    // 最终提交时间 20190508
    // 运行时间 0ms 超过 100% 用户
    // 占用内存 38.3MB 超过 83.56% 用户
}
