import entity.Node;

public class Solution_559_Maximum_Depth_of_N_Tree {
    public int maxDepth(Node root){
        if (root==null){
            return 0;
        }
        int max = 0;
        for (Node node:root.children){
            max = Math.max(maxDepth(node),max);
        }
        return max+1;
    }
    // �����ύʱ�� 20190602
    // ����ʱ�� 1ms ���� 99.25% �û�
    // �����ڴ� 42.7MB ���� 98.33% �û�
}
