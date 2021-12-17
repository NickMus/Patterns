package Decorator;

public class Main {
    public static void main(String[] args) {
        Service engineRepair = new EngineRepair(6000, "капитальный ремонт");
        Service repair = new Repair(engineRepair);
        System.out.println(repair.getPrice());
    }
}
