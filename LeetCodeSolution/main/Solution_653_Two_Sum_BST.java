import entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution_653_Two_Sum_BST {
    List<Integer> res = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        dfs(root);
        int len = res.size();
        for (int i = 0; i < len; i++){
            label:
            for (int j = i+1; j < len; j++){
                if (res.get(i) + res.get(j) == k){
                    return true;
                }
                if (res.get(i) + res.get(j) > k){
                    continue label;
                }
            }
        }
        return false;
    }
    public void dfs(TreeNode root){
        if (root==null){
            return;
        }
        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
        return;
    }
    // �����ύʱ�� 20190612
    // ����ʱ�� 27ms������ 5.31% �û�
    // �����ڴ� 38.8MB, ���� 98.39% �û�
}
