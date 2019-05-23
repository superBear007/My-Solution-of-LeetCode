public class Solution_387_First_Unique_Char {
    public int firstUniqChar(String s) {
        char[] schr = s.toCharArray();
        for (int i = 0; i < schr.length; i++){
            if (ifOnce(schr[i],schr)){
                return i;
            }
        }
        return -1;
    }
    public boolean ifOnce(char chr,char[] schr){
        int count = 0;
        for (char i:schr){
            if (i==chr){
                count++;
            }
            if (count>1){
                return false;
            }
        }
        return true;
    }
    // �����ύʱ�� 20190523
    // ����ʱ�� 30ms ���� 52.44% �û�
    // �����ڴ� 37.3MB ���� 92.00% �û�
}
