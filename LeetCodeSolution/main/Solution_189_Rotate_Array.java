public class Solution_189_Rotate_Array {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int j;
        int[] nums0 = new int[len];
        for (int i = 0; i < len; i++){
            j = (i+k)%len;
            nums0[j] = nums[i];
        }
        for (int i = 0; i < len; i++){
            nums[i] = nums0[i];
        }
    }
    // �����ύʱ�� 20190515
    // ��������ʱ�� 1ms ���� 40.44% �û�
    // ���������ڴ� 36.5MB ���� 57.65% �û�
}
