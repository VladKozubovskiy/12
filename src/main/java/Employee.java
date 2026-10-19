abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}

interface Taxable {
    double calculateTax();
}

class Developer extends Employee implements Taxable {
    private double hourlyRare;
    private int hourRare;

    public Developer(String name, double hourlyRare, int hourRare) {
        super(name);
        this.hourlyRare = hourlyRare;
        this.hourRare = hourRare;
    }

    @Override
    public double calculateSalary() {
        return hourlyRare + hourRare;
    }

    @Override
    public double calculateTax() {
        return calculateSalary() * 0.10;
    }

}

class Manager extends Employee implements Taxable {
    private double baseSalary;
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public double calculateTax() {
        return calculateSalary() * 0.13;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Developer dev = new Developer("Владислав", 3000.3, 2000);
        Manager man = new Manager("Вера", 5000, 4500);
        double devSalary = dev.calculateSalary();
        double devTax = dev.calculateTax();
        double devNetSalary = devSalary - devTax;
        double manSalary = man.calculateSalary();
        double manTax = man.calculateTax();
        double manNetSalary = manSalary - manTax;
        System.out.println("Сотрудник: " + dev.getName());
        System.out.println("Зарплата после налога: " + devNetSalary);
        System.out.println("Сотрудник: " + man.getName());
        System.out.println("Зарплата после налога: " + manNetSalary);
    }
}
