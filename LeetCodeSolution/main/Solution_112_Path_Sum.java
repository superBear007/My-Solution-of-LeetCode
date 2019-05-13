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
    // �����ύʱ�� 20190513
    // ����ʱ�� 0ms ���� 100% �û�
    // �����ڴ� 36.4MB ���� 90.94% �û�
}
