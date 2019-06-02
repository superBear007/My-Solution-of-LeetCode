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
    // �����ύʱ�� 20190602
    // ����ʱ�� 11ms ���� 8.38% �û�
    // �����ڴ� 37.5MB ���� 99.94% �û�
}