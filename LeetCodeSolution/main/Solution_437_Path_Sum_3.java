import entity.TreeNode;

public class Solution_437_Path_Sum_3 {
    // ����͵��� sum ����������·��
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
    // �����ύʱ�� 20190526
    // ����ʱ�� 9ms ���� 78.16% �û�
    // �����ڴ� 39.5MB ���� 87.72% �û�
}
