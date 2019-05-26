

import entity.Node;

import java.util.*;

public class Solution_429_N_Tree {
    // 将 Node 的每一层从根节点到叶节点每一层一个列表
    public List<List<Integer>> levelOrder(Node root) {
        Deque<Node> levelStk = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){return res;}
        levelStk.add(root);
        while (!levelStk.isEmpty()){
            List<Integer> thisList = new ArrayList<>();
            List<Node> nodeList = new ArrayList<>();
            while (!levelStk.isEmpty()){
                Node thisNode = levelStk.pollFirst();
                nodeList.add(thisNode);
                thisList.add(thisNode.val);
            }
            res.add(thisList);
            for (Node node : nodeList){
                if (node.children!=null) {
                    levelStk.addAll(node.children);
                }
            }
        }
        return res;
    }
    // 最终提交时间 20190526
    // 最终运行时间 4ms 超过了 43.24% 用户
    // 运行内存 46.2MB 超过 90.07% 用户
}
