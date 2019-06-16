import com.sun.source.tree.Tree;
import entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution_783_Minimum_Distance_BST {
    List<Integer> res = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        int dif = Integer.MAX_VALUE;
        int len = res.size();
        for (int i = 0; i < len - 1; i++) {
            dif = Math.min(dif, res.get(i + 1) - res.get(i));
        }
        return dif;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
        return;
    }
    // 最终提交时间 20190615
    // 最终运行时间 1ms 超过 41.83% 用户
    // 最终运行内存 34.6MB 超过 100/00% 用户
}
