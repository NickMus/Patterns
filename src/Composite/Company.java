package Composite;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void fireEmployee(Employee employee) {
        employees.remove(employee);
    }
    List<Employee> getEmployees() {
        return employees;
    }
}
