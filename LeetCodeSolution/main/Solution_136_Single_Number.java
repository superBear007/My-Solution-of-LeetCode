import java.util.Arrays;

public class Solution_136_Single_Number {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len/2; i++){
            if (nums[2*i] < nums[2*i + 1]){
                return nums[2*i];
            }
        }
        return nums[len-1];
    }
    // �����ύʱ�� 20190515
    // ����ʱ�� 3ms ����42.38% �û�
    // �����ڴ� 38.2MB ���� 87.93% �û�
}
