package entity;

import java.util.List;

public class ListNode {
     public int val;
     public ListNode next;
     public ListNode(int x) { val = x; }
     public static ListNode listToNode(int[] nums){
         int len = nums.length;
         ListNode iniNode = null;
         while (len > 0){
             ListNode thisNode = new ListNode(nums[len-1]);
             thisNode.next = iniNode;
             len = len - 1;
             iniNode = thisNode;
         }
         return iniNode;
     }
 }

