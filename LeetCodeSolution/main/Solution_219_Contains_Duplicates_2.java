public class Solution_219_Contains_Duplicates_2 {
    // �ж��Ƿ���ھ�����k���ڵ���ͬԪ��
    public boolean containsNearbyDuplicate(int[] nums,int k){
        int len = nums.length;
        for (int i = 0; i < len; i++){
            for (int j = i+1; j <= i+k; j++){
                if (j < len && nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    // �����ύʱ�� 20190518
    // ��������ʱ�� 1046ms ���� 5.04% �û�
    // ���������ڴ� 40.8MB ���� 83.77% �û�
}
