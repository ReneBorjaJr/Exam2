package Exam2;

public class Manager extends Employee{
    private final double Extra_Discount = 0.05;
    private double salary;

    Manager(String name, Size size, double salary) {
        super(name, size);
        setSalary(salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}
