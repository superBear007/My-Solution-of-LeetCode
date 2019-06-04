import entity.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution_590_N_Tree_Postorder_Traversal {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        dfs(root);
        return res;
    }
    public void dfs(Node root){
        if (root==null){
            return;
        }
        for (Node node:root.children){
            dfs(node);
        }
        res.add(root.val);
        return;
    }
    // �����ύʱ�� 20190604
    // ����ʱ�� 1ms ������ 100.00% �û�
    // �����ڴ� 45.5MB, ���� 85.96% �û�
}
