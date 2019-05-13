import java.util.ArrayList;
import java.util.List;

public class Solution_118_Pascal_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();
        if (numRows==0){return finalList;}
        List<Integer> oneList = new ArrayList<>();
        oneList.add(1);
        finalList.add(oneList);
        for (int i = 1; i < numRows; i++){
            List<Integer> thisList = new ArrayList<>(oneList);
            for (int j = 1; j < i; j++){
                thisList.add(finalList.get(finalList.size()-1).get(j-1) + finalList.get(finalList.size()-1).get(j));
            }
            thisList.add(1);
            finalList.add(thisList);
        }
        return finalList;
    }
    // �����ύʱ�� 20190513
    // ����ʱ�� 1ms ���� 18.20% �û�
    // �����ڴ� 32.9MB ���� 100.00% �û�
}
