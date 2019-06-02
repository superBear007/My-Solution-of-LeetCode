import entity.TreeNode;

public class Solution_563_BST_Tilt {
    int diff;

    public int findTilt(TreeNode root) {
        dfs(root);
        return diff;
    }

    public int sumTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumTree(root.left) + sumTree(root.right) + root.val;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        diff = diff + Math.abs(sumTree(root.left) - sumTree(root.right));
        dfs(root.left);
        dfs(root.right);
        return;
    }
    // 最终提交时间 20190602
    // 运行时间 11ms 超过 8.38% 用户
    // 运行内存 37.5MB 超过 99.94% 用户
}