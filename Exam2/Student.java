package Exam2;

public class Student extends Customer {
    private static long lastID = 0;
    public final long studentID;
    private final double DISCOUNT = 0.05;

    public Student(String name, Size size, long studentID) {
        super(name, size);
        this.studentID = ++lastID;
    }
    public void printUniqueStudentID() {
        System.out.println("Exam2.Student ID: " + studentID);
    }
    @Override
    public void printPriceAfterDiscount(Cloth cloth) {
        double discountedPrice = cloth.getPrice() * (1 - DISCOUNT);
        System.out.println("Discounted price for students: $" + discountedPrice);
    }
    @Override
    void printInfo() {
        super.printInfo();
        printUniqueStudentID();
    }
}
