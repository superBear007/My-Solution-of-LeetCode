import com.sun.source.tree.Tree;
import entity.TreeNode;

import javax.print.DocFlavor;

public class Solution_671_Second_Minimum_Node {
    public int findSecondMinimumValue(TreeNode root) {
        long[] nums = {Long.MAX_VALUE ,Long.MAX_VALUE};
        nums = dfs(root,nums);
        if (nums[1] == Long.MAX_VALUE){
            return -1;
        }
        return (int) nums[1];
    }
    public long[] dfs(TreeNode root,long[] res){
        if (root.val < res[0]){
            res[1] = res[0];
            res[0] = (long) root.val;
        }else if ((long)root.val > res[0]){
            res[1] = Math.min((long) root.val,res[1]);
        }
        if (root.left!=null){
            res = dfs(root.left,res);
        }
        if (root.right!=null){
            res = dfs(root.right,res);
        }
        return res;
    }
    // 提交时间 20190612
    // 运行时间 0ms 超过 100% 用户
    // 运行内存 34.1MB 超过 100% 用户
}
