public class Solution_661_Image_Smoother {
    public int[][] imageSmoother(int[][] M) {
        int r = M.length;
        int c = M[0].length;
        int[][] res = new int[r][c];
        for (int m = 0; m < r; m++){
            for (int n = 0; n < c; n++){
                int sum = M[m][n];
                int cnt = 1;
                if (m!=0){
                    sum += M[m-1][n];
                    cnt++;
                }
                if (m!=r-1){
                    sum += M[m+1][n];
                    cnt++;
                }
                if (n!=0){
                    sum += M[m][n-1];
                    cnt++;
                }
                if (n!=c-1){
                    sum += M[m][n+1];
                    cnt++;
                }
                if (m!=0&&n!=0){
                    sum += M[m-1][n-1];
                    cnt++;
                }
                if (m!=r-1&&n!=c-1){
                    sum += M[m+1][n+1];
                    cnt++;
                }
                if (m!=0&&n!=c-1){
                    sum += M[m-1][n+1];
                    cnt++;
                }
                if (m!=r-1&&n!=0){
                    sum += M[m+1][n-1];
                    cnt++;
                }
                res[m][n] = (int) sum/cnt;
            }
        }
        return res;
    }
    // �����ύʱ�� 20190612
    // ����ʱ�� 6ms ������ 83.72% �û�
    // �����ڴ� 44.8MB, ���� 44.77% �û�
}
