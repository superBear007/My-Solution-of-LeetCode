import java.util.Arrays;

public class Solution_581_Shortest_Unsorted_Subarray {
    public int findUnsortedSubarray(int[] nums) {
         int len = nums.length;
         int[] arr = Arrays.copyOf(nums,len);
         Arrays.sort(arr);
         int left = 0;
         int right = len-1;
         while (left < len && nums[left] == arr[left]){
             left++;
         }
         while (right>=0 && nums[right] == arr[right]){
             right--;
         }
         if (right < left){
             return 0;
         }else{
             return right - left + 1;
         }
    }
    // �����ύʱ�� 20190604
    // ����ʱ�� 9ms ���� 49.70% �û�
    // �����ڴ� 39.7MB ���� 98.39% �û�
}
