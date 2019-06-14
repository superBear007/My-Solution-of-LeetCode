import entity.ListNode;
import entity.TreeNode;

public class Solution_617_Merge_Two_BST {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null && t2==null){
            return null;
        }else if (t1!=null && t2==null){
            return t1;
        }else if (t2!=null && t1==null){
            return t2;
        }else{
            TreeNode res = new TreeNode(t1.val + t2.val);
            res.left = mergeTrees(t1.left,t2.left);
            res.right = mergeTrees(t1.right,t2.right);
            return res;
        }
    }
    // 最终提交时间 20190611
    // 运行时间 1ms 超过 50.21% 用户
    // 运行内存 40.2MB 超过 99.86% 用户
}
