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
    // 最终提交时间 20190602
    // 运行时间 1ms 超过 99.25% 用户
    // 运行内存 42.7MB 超过 98.33% 用户
}
