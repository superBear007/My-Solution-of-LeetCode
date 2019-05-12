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
    // ����ύʱ�� 20190512
    // ִ��ʱ�� 0ms ���� 100% �û�
    // ִ���ڴ� 37.9MB ���� 58.12% �û�
}
