import entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution_501_Find_Mode {
    List<Integer> valList = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        if (root == null){return new int[0];}
        if (root.left==null && root.right==null){return new int[]{root.val};}
        dfs(root);
        int cnt = 1;
        int maxCnt = 1;
        List<Integer> res = new ArrayList<>();
        for (int k = 1; k < valList.size();k++){
            if (valList.get(k).equals(valList.get(k-1))){
                cnt++;
                if (k==valList.size()-1){
                    if (cnt==maxCnt){
                        res.add(valList.get(k));
                    }else if(cnt>maxCnt){
                        res = new ArrayList<>();
                        res.add(valList.get(k));
                    }
                }
            }else{
                if (cnt==maxCnt){
                    res.add(valList.get(k-1));
                }else if (cnt>maxCnt){
                    res = new ArrayList<>();
                    res.add(valList.get(k-1));
                    maxCnt = cnt;
                }
                cnt = 1;
                if (k==valList.size()-1){
                    if (maxCnt==1){
                        res.add(valList.get(k));
                    }
                }
            }
        }
        int[] arr = new int[res.size()];
        for (int j=0;j < arr.length; j++){
            arr[j] = res.get(j);
        }
        return arr;
    }
    public void dfs(TreeNode root){
        if (root==null){
            return;
        }
        if (root.left!=null){
            dfs(root.left);
        }
        valList.add(root.val);
        if (root.right!=null){
            dfs(root.right);
        }
        return;
    }
    // 最终提交时间 20190601
    // 最终运行时间 3ms 打败 54.66% 用户
    // 运行内存 36.8MB 打败 99.86% 用户
}
