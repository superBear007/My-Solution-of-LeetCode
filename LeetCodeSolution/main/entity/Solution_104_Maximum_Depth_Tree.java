package entity;

public class Solution_104_Maximum_Depth_Tree {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }else if (root.left == null & root.right == null){
            return 1;
        }else{
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return leftDepth>rightDepth?(leftDepth+1):(rightDepth+1);
        }
    }
    // 最后提交时间 20190512
    // 执行时间 0ms 超过 100% 用户
    // 执行内存 37.9MB 超过 58.12% 用户
}
