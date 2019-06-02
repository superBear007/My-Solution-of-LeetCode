
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
    // �ύʱ�� 20190602
    // ����ʱ�� 6ms ���� 88.94% �û�
    // �����ڴ� 38.7MB ���� 99.92% �û�
}
