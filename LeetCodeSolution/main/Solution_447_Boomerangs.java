import java.util.HashMap;
import java.util.Map;

public class Solution_447_Boomerangs {
    public int numberOfBoomerangs(int[][] points) {
       // �ҳ����еģ�i��j��k��
        int len = points.length;
        int count = 0;
        Map<Integer,Integer> map;
        for (int i = 0; i < len; i++){
            map = new HashMap<>();
            for (int j = 0; j < len; j++){
                Integer dis = (points[i][1]-points[j][1])*(points[i][1]-points[j][1])+(points[i][0]-points[j][0])*(points[i][0]-points[j][0]);
                if (dis!=0) {
                    if (map.keySet().contains(dis)) {
                        map.put(dis, map.get(dis) + 1);
                    } else {
                        map.put(dis, 1);
                    }
                }
            }
            for (Integer a:map.values()){
                if (a > 1){
                    count = count + a*(a-1);
                }
            }
        }
        return count;
    }
    // �ύʱ�� 20190526
    // ����ʱ�� 126ms ���� 33.35% �û�
    // �����ڴ� 47.5MB ���� 35.88% �û�
}
