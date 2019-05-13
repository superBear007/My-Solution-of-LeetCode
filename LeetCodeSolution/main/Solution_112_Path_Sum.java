import entity.TreeNode;

public class Solution_112_Path_Sum {
    boolean result = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null){
            return false;
        }
        dfs(root,sum);
        return result;
    }
    public void dfs(TreeNode root,int sum){
        if (root.left == null && root.right == null){
            if (sum == root.val) {
                result = true;
            }
            return;
        }
        if (root.left != null){
            dfs(root.left,sum - root.val);
        }
        if (root.right != null){
            dfs(root.right,sum - root.val);
        }
    }
    // 最终提交时间 20190513
    // 运行时间 0ms 超过 100% 用户
    // 运行内存 36.4MB 超过 90.94% 用户
}
