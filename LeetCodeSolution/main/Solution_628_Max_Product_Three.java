import java.util.Arrays;

public class Solution_628_Max_Product_Three {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int res1 = nums[0]*nums[1]*nums[len-1];
        int res2 = nums[len-3]*nums[len-2]*nums[len-1];
        int res3 = nums[0]*nums[2]*nums[1];
        return Math.max(Math.max(res1,res2),res3);
    }
    // �����ύʱ�� 20190611
    // ����ʱ�� 14ms ���� 51.39% �û�
    // �����ڴ� 39.3MB ���� 98.50% �û�
}
