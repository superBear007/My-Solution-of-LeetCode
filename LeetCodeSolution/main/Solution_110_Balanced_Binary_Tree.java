import entity.TreeNode;

public class Solution_110_Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }else{
            int abs = Math.abs(maxTree(root.right) - maxTree(root.left));
            return abs <= 1 & isBalanced(root.left) & isBalanced(root.right);
        }
    }
    public int maxTree(TreeNode root){
        if (root == null){
            return 0;
        }else if(root.left == null & root.right == null){
            return 1;
        }else{
            int leftDepth = maxTree(root.left);
            int rightDepth = maxTree(root.right);
            return leftDepth>rightDepth?(leftDepth + 1):(rightDepth + 1);
        }
    }
    // �����ύʱ�� 20190512
    // ����ʱ�� 1ms ���� 82.48% ���û�
    // �����ڴ� 36.9MB ������ 97.84% ���û�
    // �����ᵽ & �� && ������
}
