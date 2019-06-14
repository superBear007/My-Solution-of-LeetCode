import entity.TreeNode;

public class Solution_669_Trim_BST {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null){
            return null;
        }
        if (root.val <= R && root.val >= L){
            root.left = trimBST(root.left,L,R);
            root.right = trimBST(root.right,L,R);
        }else if (root.val > R){
            root = trimBST(root.left,L,R);
        }else{
            root = trimBST(root.right,L,R);
        }
        return root;
    }
    // �ύʱ�� 20190612
    // ����ʱ�� 0ms ���� 100% �û�
    // �����ڴ� 38.2MB ���� 97.27% �û�
}
