public class Solution_485_Max_Consecutives_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int maxCnt = 0;
        int cnt = 0;
        for (int m = 0; m < len; m++){
            if (nums[0]==1){
                cnt++;
            }else{
                maxCnt = Math.max(cnt,maxCnt);
                cnt = 0;
            }
        }
        maxCnt = Math.max(cnt,maxCnt);
        return maxCnt;
        // �����ύʱ�� 20190530
        // ����ʱ�� 2ms ���� 99.87% �û�
        // �����ڴ� 37.7MB ���� 99.68% �û�
    }
}
