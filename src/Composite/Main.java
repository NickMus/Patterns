package Composite;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Bob", 100, "senior");
        Secretary secretary = new Secretary("Sarah", 50, "secretary");
        Company company = new Company();
        company.addEmployee(developer);
        company.addEmployee(secretary);

    }
}
