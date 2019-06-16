public class Solution_788_Rotated_Digits {
    public int rotatedDigits(int N) {
        int cnt = 0;
        int ini = 1;
        while (ini <= N){
            if (isRotated(ini)){
                cnt++;
            }
            ini++;
        }
        return cnt;
    }
    public boolean isRotated(int num){
        // 0,1,8 ����
        // 2 ת��Ϊ 5
        // 6 ת��Ϊ 9
        // 3,4,7 ���Ϸ�
        String nstr = String.valueOf(num);
        if (nstr.contains("3") || nstr.contains("4") || nstr.contains("7")){
            return false;
        }
        String mstr = nstr.replace("2","a").replace("5","2").replace("a","5");
        mstr = mstr.replace("6","a").replace("9","6").replace("a","9");
        return !nstr.equals(mstr);
    }
    // �����ύʱ�� 20190616
    // ��������ʱ�� 67ms ���� 5.10% �û�
    // ���������ڴ� 36.3MB ���� 30.31% �û�
}
