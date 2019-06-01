import entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution_538_Convert_Greater_Tree {
    List<Integer> arr = new ArrayList<>();
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return newConvert(root);
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
    public TreeNode newConvert(TreeNode root){
        if (root==null){
            return null;
        }
        int nowVal = root.val;
        for (int m:arr){if (m > nowVal){root.val = root.val + m;}}
        root.left = newConvert(root.left);
        root.right = newConvert(root.right);
        return root;
    }
    // �����ύʱ�� 20190601
    // ����ʱ�� 107ms ���� 5.48% �û�
    // �����ڴ� 38.1MB ���� 99.73% �û�
}
