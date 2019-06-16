public class Solution_704_Binary_Search {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        if (nums[left] == target){
            return left;
        }else if(nums[left] > target){
            return -1;
        }
        if (nums[right] == target){
            return right;
        }else if(nums[right] < target){
            return -1;
        }
        while (left < right){
            int middle = (left + right)/2;
            if (nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                right = middle;
            }else{
                left = middle + 1;
            }
        }
        return -1;
    }
    // �����ύʱ�� 20190614
    // ��������ʱ�� 0ms ���� 100.00% �û�
    // ���������ڴ� 40.1MB ���� 83.08% �û�
}
