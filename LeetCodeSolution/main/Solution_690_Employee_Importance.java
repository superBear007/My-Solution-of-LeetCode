import entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class Solution_690_Employee_Importance {
    public int getImportance(List<Employee> employees, int id) {
        for (Employee emp : employees){
            if (emp.id == id){
                List<Integer> res = emp.subordinates;
                if (res.size()==0){
                    return emp.importance;
                }else{
                    int ak = emp.importance;
                    for (Integer m : res){
                        ak = ak + getImportance(employees,m);
                    }
                    return ak;
                }
            }
        }
        return 0;
    }
    // �����ύʱ�� 20190614
    // ����ʱ�� 11ms ���� 19.46% �û�
    // �����ڴ� 48.74MB ���� 92.43% �û�
}
