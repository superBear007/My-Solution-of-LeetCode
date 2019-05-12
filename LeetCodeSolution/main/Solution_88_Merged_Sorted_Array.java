public class Solution_88_Merged_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums0 = new int[m + n];
        int ini1 = 0;
        int ini2 = 0;
        thisLabel:
        while (ini1 < m || ini2 < n) {
            if (ini1 == m) {
                while (ini2 < n) {
                    nums0[ini2 + m] = nums2[ini2];
                    ini2++;
                }
                break thisLabel;
            }
            if (ini2 == n) {
                while (ini1 < m) {
                    nums0[ini1 + n] = nums1[ini1];
                    ini1++;
                }
                break thisLabel;
            }
            if (nums1[ini1] <= nums2[ini2]) {
                nums0[ini1 + ini2] = nums1[ini1];
                ini1++;
            } else {
                nums0[ini1 + ini2] = nums2[ini2];
                ini2++;
            }
        }
        for (int j = 0; j < m + n; j++) {
            nums1[j] = nums0[j];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Solution_88_Merged_Sorted_Array sol = new Solution_88_Merged_Sorted_Array();
        sol.merge(nums1,3,nums2,3);
    }
    // ����ύʱ�� 20190512
    // ����ʱ��Ϊ 0ms ������ 100% ���û�
    // �����ڴ� 35.1MB ������ 97.44% ���û�
    // PS: ���𰸵ķ�����������һ�����飬�벻��Ч��Ҳ����
    // ���ֱ����nums1��������ռ���ڴ�Ӧ�û��С
}
