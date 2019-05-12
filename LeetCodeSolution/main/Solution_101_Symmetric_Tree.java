import entity.TreeNode;

public class Solution_101_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }else{
            return isSym(root.left,root.right);
        }
    }
    public boolean isSym(TreeNode rootLeft,TreeNode rootRight){
        if (rootLeft == null & rootRight == null){
            return true;
        }else if (rootLeft==null || rootRight==null){
            return false;
        }else{
            return (rootLeft.val==rootRight.val)&(isSym(rootLeft.right,rootRight.left)&isSym(rootLeft.left,rootRight.right));
        }
    }
    // �����ύʱ�� 20190512
    // ִ����ʱ 0ms ���� 100% �û�
    // ִ���ڴ� 34.7MB ���� 100% �û�
}
