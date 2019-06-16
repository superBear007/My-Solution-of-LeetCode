public class Solution_724_Pivot_Index {
    public int pivotIndex(int[] nums) {
        if (nums.length <= 2){return -1;}
        int sum = 0;
        for (int n : nums){sum = sum + n;}
        int ind = 0;
        int left = 0;
        int right = sum - nums[0];
        while (ind <= nums.length - 2){
            if (left == right){
                return ind;
            }else{
                // [1,2,3,4,ind,8]
                // [1,2,3,4,5,ind]
                left = left + nums[ind];
                right = right - nums[ind+1];
                ind++;
            }
        }
        if (left == right){
            return nums.length - 1;
        }else{
            return -1;
        }
    }
    // �����ύʱ�� 20190614
    // ��������ʱ�� 1ms ���� 100.00% �û�
    // ���������ڴ� 40.1MB ���� 95.64% �û�
}
