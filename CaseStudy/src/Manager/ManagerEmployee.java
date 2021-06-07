package Manager;

import Commons.ReadAndWrite;
import Models.users.Employee;

import java.util.Map;

public class ManagerEmployee {
    public static void showAllEmployee() {
        Map<String, Employee> employeeMap = ReadAndWrite.readEmployee();
        employeeMap.keySet();
    }
}
