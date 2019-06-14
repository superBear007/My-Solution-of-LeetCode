import entity.TreeNode;

public class Solution_687_Longest_Univalue_Path {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        curPath(root);
        return max;
    }
    // ���㾭��root�ڵ��path
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
    // �����ύʱ�� 20190614
    // ����ʱ�� 6ms ���� 14.34% �û�
    // �����ڴ� 41MB ���� 89.54% �û�
}
