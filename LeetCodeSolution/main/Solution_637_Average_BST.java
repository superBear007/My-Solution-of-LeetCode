import entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution_637_Average_BST {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root!=null){stack.push(root);}
        while (!stack.empty()){
            long sum = 0;
            long cnt = 0;
            List<TreeNode> st = new ArrayList<>();
            while (!stack.empty()){
                TreeNode node = stack.pop();
                st.add(node);
                sum += node.val;
                cnt++;
            }
            res.add((double)sum/cnt);
            for (TreeNode node : st){
                if (node.left!=null){
                    stack.push(node.left);
                }
                if (node.right!=null){
                    stack.push(node.right);
                }
            }
        }
        return res;
    }
    // 最终提交时间 20190611
    // 运行时间 5ms 超过 13.60% 用户
    // 运行内存 41.3MB 超过 73.70% 用户
}
