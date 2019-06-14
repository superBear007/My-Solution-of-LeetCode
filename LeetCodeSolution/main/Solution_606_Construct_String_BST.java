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
    // 最终提交时间 20190611
    // 运行时间 6ms 超过 80.65% 用户
    // 运行内存 38.7MB 超过 94.21% 用户
}
