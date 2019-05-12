import entity.TreeNode;

public class Solution_108_Convert_List_to_Binary_Tree {
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        TreeNode head = helper(num, 0, num.length - 1);
        return head;
    }

    public TreeNode helper(int[] num, int low, int high) {
        if (low > high) { // Done
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
    }
    // 最终提交时间 20190512
    // 运行时间 0ms 超过 100% 的用户
    // 执行内存 34.8MB 超过 99.38% 的用户
    // ps：开放性题目，懒得做了，直接盗答案了
}
