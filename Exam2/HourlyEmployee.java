package Exam2;

public class HourlyEmployee extends Employee{
    private float hoursWorked;
    private double hourlyWage;
    public HourlyEmployee(String name, Size size, Float hoursWorked, double hourlyWage) {
        super(name, size);
        setHourlyWage(hourlyWage);
        setHoursWorked(hoursWorked);

    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hours) {
        if (hours >= 0) {
            this.hoursWorked = hours;
        } else {
            throw new IllegalArgumentException("Hours worked cannot be negative");
        }
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double wage) {
        if (wage >= 0) {
            this.hourlyWage = wage;
        } else {
            throw new IllegalArgumentException("Hourly wage cannot be negative");
        }
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyWage;
    }
}
