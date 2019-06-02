
import entity.TreeNode;

public class Solution_572_Subtree_of_Another_Tree {
    public boolean isSubtree(TreeNode s, TreeNode t){
        if (s==null){return false;}
        if (isSame(s,t)){return true;}
        return isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public boolean isSame(TreeNode node1, TreeNode node2){
        if ((node1 == null && node2 != null)||(node2 == null && node1 != null)){
            return false;
        }else if (node1==null && node2==null){
            return true;
        }else{
            return (node1.val==node2.val)&&(isSame(node1.left,node2.left))&&(isSame(node1.right,node2.right));
        }
    }
    // 提交时间 20190602
    // 运行时间 6ms 超过 88.94% 用户
    // 运行内存 38.7MB 超过 99.92% 用户
}
