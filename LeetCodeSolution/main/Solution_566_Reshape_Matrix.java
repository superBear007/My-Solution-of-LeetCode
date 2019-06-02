public class Solution_566_Reshape_Matrix {
    public int[][] matrixReshape(int[][] nums, int r,int c){
        int[][] res = new int[r][c];
        int r0 = nums.length;
        int c0 = nums[0].length;
        if (r0*c0!=r*c){return nums;}
        for (int m = 0; m < r; m++){
            for (int n = 0; n < c; n++){
                res[m][n] = nums[(m*c+n)/c0][(m*c+n)%c0];
            }
        }
        return res;
    }
    // �����ύʱ�� 20190602
    // ����ʱ�� 1ms ���� 100.00% �û�
    // �����ڴ� 39.3MB ���� 98.20% �û�
}
