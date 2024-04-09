package Exam2;

public abstract class Employee extends Customer implements Payable{
    protected final double discount = 0.10;

    public Employee(String name, Size size) {
        super(name, size);
    }
    @Override
    public void printPriceAfterDiscount(Cloth cloth) {
        double discountedPrice = cloth.getPrice() * (1 - discount);
        System.out.println("Discounted price for employees: $" + discountedPrice);
    }
}
