import java.util.ArrayList;
import java.util.List;

public class Solution_766_Toeplitz_Matrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int m = 1-c; m < r; m++){
            List<Integer> res = new ArrayList<>();
            for (int k = 0; k < c; k++){
                if (k + m >= 0 && k + m < r){
                    res.add(matrix[k+m][k]);
                }
            }
            if (res.size()>1){
                for (int k = 0; k < res.size()-1;k++){
                    if (!res.get(k).equals(res.get(k+1))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    // 最终提交时间 20190615
    // 最终运行时间 2ms 超过 29.43% 用户
    // 最终运行内存 40.2MB 超过 99.74% 用户
}
