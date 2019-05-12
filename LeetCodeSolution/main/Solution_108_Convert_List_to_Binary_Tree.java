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
    // �����ύʱ�� 20190512
    // ����ʱ�� 0ms ���� 100% ���û�
    // ִ���ڴ� 34.8MB ���� 99.38% ���û�
    // ps����������Ŀ���������ˣ�ֱ�ӵ�����
}
