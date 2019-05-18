import java.util.Arrays;

public class Solution_217_Contains_Duplicates {
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        if (nums.length==1){
            return false;
        }
        for (int m = 1; m < nums.length; m++){
            if (nums[m]==nums[m-1]){
                return true;
            }
        }
        return false;
    }
    // �����ύʱ�� 20190518
    // ��������ʱ�� 3ms ���� 99.14% �û�
    // �����ύʱ�� 43.5MB ���� 38.39% �û�
}
