import java.util.Arrays;

public class Solution_703_Kth_Largest {

}
class KthLargest {
    int[] nums;
    int k;
    public KthLargest(int k, int[] nums) {
        this.nums = nums;
        this.k = k;
    }
    public int add(int val) {
        int[] num = new int[nums.length + 1];
        for (int m = 0; m < nums.length; m++){
            num[m] = nums[m];
        }
        num[nums.length] = val;
        nums = num;
        Arrays.sort(num);
        return num[nums.length - k];
    }
    // �����ύʱ�� 20190614
    // ��������ʱ�� 731ms ���� 5.01% �û�
    // ���������ڴ� 60.4MB ���� 5.01% �û�
}
