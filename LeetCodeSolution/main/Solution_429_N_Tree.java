

import entity.Node;

import java.util.*;

public class Solution_429_N_Tree {
    // �� Node ��ÿһ��Ӹ��ڵ㵽Ҷ�ڵ�ÿһ��һ���б�
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
    // �����ύʱ�� 20190526
    // ��������ʱ�� 4ms ������ 43.24% �û�
    // �����ڴ� 46.2MB ���� 90.07% �û�
}
