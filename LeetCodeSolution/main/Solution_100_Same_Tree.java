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
        // �����ύʱ�� 20190512
        // ��������ʱ��Ϊ 0ms ���� 100% ���û�
        // ���������ڴ�Ϊ 33.3MB  ���� 100% �û�
    }
}
