import entity.TreeNode;

public class Solution_437_Path_Sum_3 {
    // 计算和等于 sum 的所有树的路径
    int count = 0;
    public int pathSum(TreeNode root, int sum) {
        doDfs(root, sum);
        return count;
    }
    public void dfs(TreeNode root,int sum){
        if (root.val == sum){
            count++;
        }
        if (root.left!=null) {
            dfs(root.left, sum - root.val);
        }
        if (root.right!=null) {
            dfs(root.right, sum - root.val);
        }
        return;
    }
    public void doDfs(TreeNode node,int sum){
        if (node==null){return;}
        dfs(node,sum);
        doDfs(node.left,sum);
        doDfs(node.right,sum);
        return;
    }
    // 最终提交时间 20190526
    // 运行时间 9ms 超过 78.16% 用户
    // 运行内存 39.5MB 超过 87.72% 用户
}
