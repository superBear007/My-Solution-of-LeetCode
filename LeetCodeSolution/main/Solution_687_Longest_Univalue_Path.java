import entity.TreeNode;

public class Solution_687_Longest_Univalue_Path {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        curPath(root);
        return max;
    }
    // 计算经过root节点的path
    public int curPath(TreeNode root){
        int res = 0;
        if (root == null){
            return 0;
        }
        int left = curPath(root.left);
        int right = curPath(root.right);
        int counterLeft = 0;
        int counterRight = 0;
        if (root.left!=null && root.val == root.left.val){
            counterLeft = left + 1;
        }
        if (root.right!=null && root.val == root.right.val){
            counterRight = right + 1;
        }
        max = Math.max(counterLeft + counterRight,max);
        return Math.max(counterLeft,counterRight);
    }
    // 最终提交时间 20190614
    // 运行时间 6ms 超过 14.34% 用户
    // 运行内存 41MB 超过 89.54% 用户
}
