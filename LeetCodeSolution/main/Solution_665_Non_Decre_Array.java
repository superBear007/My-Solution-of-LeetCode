public class Solution_665_Non_Decre_Array {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;
        int changeMade = 0;
        for(int i = 0; i < n - 1; ++i) {
            int j = i + 1;
            if(nums[i] > nums[j]) {
                changeMade++;
                if(changeMade > 1) return false;
                // change something here, nums[i] or nums[j]?
                if(i == 0) {
                    nums[i] = nums[j];
                } else if(i >= 1 && nums[i - 1] <= nums[j]) {
                    nums[i] = nums[j];
                } else {
                    nums[j] = nums[i];
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution_665_Non_Decre_Array sol = new Solution_665_Non_Decre_Array();
        int[] nums = {4,2,3};
        sol.checkPossibility(nums);
    }
    // �����ύʱ�� 20190612
    // ����ʱ�� 1ms ���� 99.92% �û�
    // �����ڴ� 46.6MB ���� 5.03% �û�
}
