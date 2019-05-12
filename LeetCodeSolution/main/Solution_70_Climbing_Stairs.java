public class Solution_70_Climbing_Stairs {
    public int climbStairs(int n) {
        if (n < 4){
            return n;
        }else{
            int one = 3;
            int two = 2;
            int m = 3;
            int cur = 3;
            while (m++ < n){
                cur = one + two;
                two = one;
                one = cur;
            }
            return cur;
        }
    }

    public static void main(String[] args) {
        Solution_70_Climbing_Stairs sol = new Solution_70_Climbing_Stairs();
        System.out.println(sol.climbStairs(37));
    }
    // �����ύʱ��Ϊ20190512
    // ����ʱ��Ϊ 0ms ������ 100% �û�
    // �����ڴ�Ϊ 32.2MB ������ 100% �û�
    // PS��ͬ����˼·��һ��ʼ�õݹ飬��ʾ��������ʱ�䣬����ѡ��ֱ����ѭ����
    // �ɼ��ݹ���Ȼ�ã�����Ч�ʲ�һ����
}
