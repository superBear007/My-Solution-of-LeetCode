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
    // 最终提交时间 20190512
    // 运行时间 1ms 超过 82.48% 的用户
    // 运行内存 36.9MB 超过了 97.84% 的用户
    // 深刻体会到 & 和 && 的区别
}
