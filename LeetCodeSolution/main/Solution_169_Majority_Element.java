import java.util.Arrays;

public class Solution_169_Majority_Element {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int m = 0;
        int k = nums[0];
        int count = 0;
        while (m < len){
            if (nums[m] == k){
                count++;
                if (count > len/2){
                    return k;
                }
            }else{
                k = nums[m];
                count = 1;
            }
            m++;
        }
        return -1;
    }
    // �����ύʱ�� 20190515
    // ��������ʱ�� 3ms ���� 73.09% �û�
    // ���������ڴ� 40.7MB ���� 93.42% �û�
}
