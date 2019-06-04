import java.util.Arrays;

public class Solution_594_Longest_Harmonious_Subsequence {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len == 0){return 0;}
        int maxCnt = 0;
        for (int i = 0; i < len; i++){
            for (int j = len - 1; j > i; j--){
                if (nums[j] - nums[i] == 1){
                    maxCnt = Math.max(maxCnt,j - i + 1);
                    break;
                }
            }
        }
        return maxCnt;
    }
    // �ύʱ�� 20190604
    // ����ʱ�� 302ms �������� 5.51% �û�
    // �����ڴ� 58.9MB, ���� 5.12% �û�
}
