public class Solution_496_Next_Greater_Element {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int k;
        for (int m = 0; m < len1; m++){
            k = 0;
            while (nums1[m]!=nums2[k]){
                k++;
            }
            while (k < len2 && nums1[m] >= nums2[k]){
                k++;
            }
            if (k==len2){
                nums1[m] = -1;
            }else{
                nums1[m] = nums2[k];
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        Solution_496_Next_Greater_Element sol = new Solution_496_Next_Greater_Element();
        sol.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
    }
    // �����ύʱ�� 20190530
    // ����ʱ�� 3ms ���� 82.15% �û�
    // �����ڴ� 36.4MB ���� 99.18% �û�
}
