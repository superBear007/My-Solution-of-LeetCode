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
    // �����ύʱ�� 20190611
    // ����ʱ�� 1ms ���� 50.21% �û�
    // �����ڴ� 40.2MB ���� 99.86% �û�
}
