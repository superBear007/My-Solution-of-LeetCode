public class Solution_733_Flood_Fill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc]==newColor){return image;}
        dfs(image,sr,sc,newColor);
        return image;
    }
    public void dfs(int[][] image,int sr,int sc,int newColor){
        int val = image[sr][sc];
        image[sr][sc] = newColor;
        if (sr < image.length - 1 && image[sr+1][sc] == val){
            dfs(image,sr+1,sc,newColor);
        }
        if (sc < image[0].length - 1 && image[sr][sc+1] == val){
            dfs(image,sr,sc+1,newColor);
        }
        if (sr > 0 && image[sr-1][sc] == val){
            dfs(image,sr-1,sc,newColor);
        }
        if (sc > 0 && image[sr][sc-1] == val){
            dfs(image,sr,sc-1,newColor);
        }
        return;
    }
    // �����ύʱ�� 20190614
    // ��������ʱ�� 1ms ���� 95.98% �û�
    // �����ύʱ�� 46.1MB ���� 57.17% �û�
}
