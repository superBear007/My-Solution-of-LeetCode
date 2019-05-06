import entity.ListNode;

// 这是一个很有意思的题，直觉上的思路是直接把两个链表转化为数字，相加，然后再转化为链表
// 但测试用例中存在超过long长度的链表，直接杜绝了这种可能，因此我们只能按照进制递归
public class Solution_2_Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNode(l1,l2,0);
    }
    public ListNode addNode(ListNode l1, ListNode l2,int index){
        if (l1 == null & l2 == null){
            if (index == 0){
                return null;
            }else{
                return new ListNode(1);
            }
        }else if (l1 != null & l2 != null){
            if (l1.val + l2.val + index > 9){
                int k = l1.val + l2.val + index - 10;
                ListNode nextNode = addNode(l1.next,l2.next,1);
                ListNode node = new ListNode(k);
                node.next = nextNode;
                return node;
            }else{
                int k = l1.val + l2.val + index;
                ListNode nextNode = addNode(l1.next,l2.next,0);
                ListNode node = new ListNode(k);
                node.next = nextNode;
                return node;
            }
        }else if (l1 == null & l2 != null){
            if (l2.val + index > 9){
                int k = l2.val + index - 10;
                ListNode nextNode = addNode(l1,l2.next,1);
                ListNode node = new ListNode(k);
                node.next = nextNode;
                return node;
            }else{
                int k = l2.val + index;
                ListNode nextNode = addNode(l1,l2.next,0);
                ListNode node = new ListNode(k);
                node.next = nextNode;
                return node;
            }
        }else{
            if (l1.val + index > 9){
                int k = l1.val + index - 10;
                ListNode nextNode = addNode(l1.next,l2,1);
                ListNode node = new ListNode(k);
                node.next = nextNode;
                return node;
            }else{
                int k = l1.val + index;
                ListNode nextNode = addNode(l1.next,l2,0);
                ListNode node = new ListNode(k);
                node.next = nextNode;
                return node;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4,3};
        int[] nums2 = {5,6,4};
        Solution_2_Add_Two_Numbers sol = new Solution_2_Add_Two_Numbers();
        ListNode node = sol.addTwoNumbers(ListNode.listToNode(nums1),ListNode.listToNode(nums2));
        System.out.println(node.val);
    }

    // 最终提交时间 20190506
    // 执行时间 2ms 超过95%的用户
    // 占用空间42.6ms 超过53.02%的用户
}
