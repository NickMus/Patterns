package Composite;

public class Developer extends Employee {
    public Developer(String name, int salary, String role) {
        super(name, salary, role);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public void setRole(String role) {
        super.setRole(role);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public String getRole() {
        return super.getRole();
    }
}
