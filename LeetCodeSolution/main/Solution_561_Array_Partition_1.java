import java.util.Arrays;

public class Solution_561_Array_Partition_1 {
    public int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i=i+2){
            sum = sum + nums[i];
        }
        return sum;
    }
    // �����ύʱ�� 20190602
    // ����ʱ�� 14ms ���� 92.10% �û�
    // �����ڴ� 38.8MB ���� 99.97% �û�
}
