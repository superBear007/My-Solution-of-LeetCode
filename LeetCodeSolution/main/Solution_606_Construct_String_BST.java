import entity.TreeNode;

public class Solution_606_Construct_String_BST {
    public String tree2str(TreeNode t) {
       if (t==null){return "";}
       if (t.left==null && t.right==null){
           return ""+t.val;
       }else if (t.left==null && t.right!=null){
           return "" + t.val + "()(" + tree2str(t.right) + ")";
       }else if (t.left!=null && t.right==null){
           return "" + t.val + "("+tree2str(t.left)+")";
       }else{
       return "" + t.val + "(" + tree2str(t.left) + ")" + "(" + tree2str(t.right) + ")";
    }
    }
    // �����ύʱ�� 20190611
    // ����ʱ�� 6ms ���� 80.65% �û�
    // �����ڴ� 38.7MB ���� 94.21% �û�
}
