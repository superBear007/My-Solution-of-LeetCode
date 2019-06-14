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
    // 最终提交时间 20190614
    // 运行时间 11ms 超过 19.46% 用户
    // 运行内存 48.74MB 超过 92.43% 用户
}
