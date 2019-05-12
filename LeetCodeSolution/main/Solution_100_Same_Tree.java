import entity.TreeNode;

public class Solution_100_Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null & q == null){
            return true;
        }else if (p == null || q == null){
            return false;
        }else{
            if (p.val != q.val){
                return false;
            }else{
                return isSameTree(p.left,q.left)&isSameTree(p.right,q.right);
            }
        }
        // 最终提交时间 20190512
        // 最终运行时间为 0ms 超过 100% 的用户
        // 最终运行内存为 33.3MB  超过 100% 用户
    }
}
