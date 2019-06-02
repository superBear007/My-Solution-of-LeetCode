import entity.TreeNode;

public class Solution_543_Diameter_of_BST {
    public int diameterOfBinaryTree(TreeNode root){
        if (root==null){return 0;}
        int rootVal = maxDepth(root.left) + maxDepth(root.right) + 1;
        int diaUn = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(rootVal,diaUn);
    }
    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        if (root.left==null && root.right == null){
            return 1;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth,rightDepth) + 1;
    }
    // 提交时间 20190602
    // 运行时间 9ms 超过 14.78% 用户
    // 运行内存 36.1MB 超过 100.00% 用户
}
