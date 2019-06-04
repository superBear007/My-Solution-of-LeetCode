import entity.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution_589_N_Tree_Preorder_Traversal {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        dfs(root);
        return res;
    }
    public void dfs(Node root){
        if (root==null){
            return;
        }
        res.add(root.val);
        for (Node node:root.children){
            dfs(node);
        }
        return;
    }
    // �����ύʱ�� 20190604
    // ����ʱ�� 1ms ���� 100.00% �û�
    // �����ڴ� 49.1ms ���� 21.46% �û�
}
