public class Solution_167_Two_Sum_2 {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        for (int i = 0; i < len; i++){
            for (int j = i+1; j < len; j++){
                if (numbers[i] + numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
                if (numbers[i] + numbers[j] > target){
                    break;
                }
            }
        }
        return new int[]{1,1};
    }
    // �����ύʱ�� 20190515
    // ��������ʱ�� 46ms ���� 11.49% �û�
    // ���������ڴ� 37.3MB ���� 57.11% �û�
}
