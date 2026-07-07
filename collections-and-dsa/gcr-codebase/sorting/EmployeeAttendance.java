import java.util.Arrays;
import java.util.Comparator;

class Employee {
    int id;
    int attendance;

    Employee(int id, int attendance) {
        this.id = id;
        this.attendance = attendance;
    }
}

public class EmployeeAttendance {

    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int k) {

        Employee[] employees = new Employee[employeeIds.length];

        for (int i = 0; i < employeeIds.length; i++) {
            employees[i] = new Employee(employeeIds[i], attendance[i]);
        }

        Arrays.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {

                if (e1.attendance != e2.attendance) {
                    return e2.attendance - e1.attendance;
                }

                return e1.id - e2.id;
            }
        });

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = employees[i].id;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};
        int k = 3;

        int[] result = topKEmployees(employeeIds, attendance, k);

        System.out.println(Arrays.toString(result));
    }
}