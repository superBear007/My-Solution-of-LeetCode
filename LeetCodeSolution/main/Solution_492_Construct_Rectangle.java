public class Solution_492_Construct_Rectangle {
    public int[] constructRectangle(int area) {
        int W = (int) Math.sqrt(area);
        while (area % W != 0) {
            W = W - 1;
        }
        return new int[]{area / W, W};
    }

    public static void main(String[] args) {
        Solution_492_Construct_Rectangle sol = new Solution_492_Construct_Rectangle();
        System.out.println(sol.constructRectangle(2));
    }
    // �����ύʱ�� 20190530
    // ����ʱ�� 0ms ������100% �û�
    // �����ڴ� 32.6MB, ����50.67% �û�
}
