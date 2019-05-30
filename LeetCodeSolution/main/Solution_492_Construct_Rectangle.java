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
    // 最终提交时间 20190530
    // 运行时间 0ms ，超过100% 用户
    // 运行内存 32.6MB, 超过50.67% 用户
}
