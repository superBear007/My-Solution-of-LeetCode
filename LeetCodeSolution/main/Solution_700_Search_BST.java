import entity.TreeNode;

public class Solution_700_Search_BST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null){
            return null;
        }
        if (root.left == null && root.right == null && root.val != val){
            return null;
        }
        if (root.val == val){
            return root;
        }else if (root.val > val){
            return searchBST(root.left,val);
        }else{
            return searchBST(root.right,val);
        }
    }
    // 最终提交时间 20190614
    // 最终运行时间 0ms 超过 100.00% 用户
    // 最终运行内存 38.2MB 超过 99.79% 用户
}
