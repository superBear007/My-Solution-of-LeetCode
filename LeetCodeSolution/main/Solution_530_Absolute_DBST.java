import entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution_530_Absolute_DBST {
    List<Integer> arr = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        int len = arr.size();
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i < len; i++){
            diff = Math.min(diff,arr.get(i)-arr.get(i-1));
        }
        return diff;
    }
    public void dfs(TreeNode root){
        if (root==null){
            return;
        }
        if (root.left!=null){
            dfs(root.left);
        }
        arr.add(root.val);
        if (root.right!=null){
            dfs(root.right);
        }
        return;
    }
    // �����ύʱ�� 20190601
    // ����ʱ�� 2ms ���� 57.18% �û�
    // �����ڴ� 38.4MB ���� 98.14% �û�
}
