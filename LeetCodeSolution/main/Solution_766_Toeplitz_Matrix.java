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
    // �����ύʱ�� 20190615
    // ��������ʱ�� 2ms ���� 29.43% �û�
    // ���������ڴ� 40.2MB ���� 99.74% �û�
}
