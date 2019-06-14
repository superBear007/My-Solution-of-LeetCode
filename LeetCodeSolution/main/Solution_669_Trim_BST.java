import entity.TreeNode;

public class Solution_669_Trim_BST {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null){
            return null;
        }
        if (root.val <= R && root.val >= L){
            root.left = trimBST(root.left,L,R);
            root.right = trimBST(root.right,L,R);
        }else if (root.val > R){
            root = trimBST(root.left,L,R);
        }else{
            root = trimBST(root.right,L,R);
        }
        return root;
    }
    // 提交时间 20190612
    // 运行时间 0ms 超过 100% 用户
    // 运行内存 38.2MB 超过 97.27% 用户
}
