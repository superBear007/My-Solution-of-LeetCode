import com.sun.source.tree.Tree;
import entity.TreeNode;

import java.util.*;

public class Solution_107_Tree_Order_Traversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        Deque<TreeNode> thisQue = new LinkedList<>();
        if (root==null) {
            return finalList;
        }else{
            thisQue.add(root);
        }
        Deque<TreeNode> newQue;
        while (thisQue.size()>0){
            List<Integer> level = new ArrayList<>();
            newQue = new LinkedList<>();
            while (thisQue.size() > 0) {
                TreeNode thisNode = thisQue.pollFirst();
                if (thisNode.left!=null){
                    newQue.add(thisNode.left);
                }
                if (thisNode.right!=null){
                    newQue.add(thisNode.right);
                }
                level.add(thisNode.val);
            }
            finalList.add(0,level);
            thisQue = newQue;
        }
        return finalList;
    }
    // 最终提交时间 20190512
    // 运行时间 1ms ，超过 88.59% 的用户
    // 运行内存 35.2MB, 超过 80.57% 的用户
}
