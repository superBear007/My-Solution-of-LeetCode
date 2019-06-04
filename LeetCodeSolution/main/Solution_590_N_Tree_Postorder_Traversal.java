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
    // 最终提交时间 20190604
    // 运行时间 1ms ，超过 100.00% 用户
    // 运行内存 45.5MB, 超过 85.96% 用户
}
