import com.sun.source.tree.Tree;
import entity.TreeNode;

public class Solution_111_Minimum_Depth_Tree {
    int minNum = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        dfs(root,1);
        return minNum;
    }
    public void dfs (TreeNode root,int curNum){
        if (root.left == null && root.right == null){
            minNum = curNum < minNum?curNum:minNum;
            return;
        }
        if (root.left!=null){
            dfs(root.left,curNum+1);
        }
        if (root.right!=null){
            dfs(root.right,curNum+1);
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(2);
        a.left = new TreeNode(4);
        a.right = new TreeNode(5);
        TreeNode b = new TreeNode(1);
        b.left = a;
        b.right = new TreeNode(3);
        Solution_111_Minimum_Depth_Tree sol = new Solution_111_Minimum_Depth_Tree();
        System.out.println(sol.minDepth(b));
    }
    // �����ύʱ�� 20190512
    // ��������ʱ�� 0ms ������ 100.00% �û�
    // ���������ڴ� 38.3MB ������ 67.74% �û�
}
