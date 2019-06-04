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
    // 最终提交时间 20190604
    // 运行时间 1ms 超过 100.00% 用户
    // 运行内存 49.1ms 超过 21.46% 用户
}
