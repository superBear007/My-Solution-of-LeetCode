import entity.TreeNode;

public class Solution_700_Search_BST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null){
            return null;
        }
        if (root.left == null && root.right == null && root.val != val){
            return null;
        }
        if (root.val == val){
            return root;
        }else if (root.val > val){
            return searchBST(root.left,val);
        }else{
            return searchBST(root.right,val);
        }
    }
    // �����ύʱ�� 20190614
    // ��������ʱ�� 0ms ���� 100.00% �û�
    // ���������ڴ� 38.2MB ���� 99.79% �û�
}
