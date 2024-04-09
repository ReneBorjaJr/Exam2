package Exam2;

public class Business implements Payable {
    private String name;
    private int productQtySupplied;
    private double productPrice;

    public Business(String name, int productQtySupplied, double productPrice) {
        setName(name);
        setProductPrice(productPrice);
        setProductQtySupplied(productQtySupplied);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public int getProductQtySupplied() {
        return this.productQtySupplied;
    }

    public void setProductQtySupplied(int productQtySupplied) {
        if (productQtySupplied >= 0) {
            this.productQtySupplied = productQtySupplied;
        } else {
            throw new IllegalArgumentException("Product quantity supplied cannot be negative");
        }

    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(double productPrice) {
        if (productPrice >= 0) {
            this.productPrice = productPrice;
        } else {
            throw new IllegalArgumentException("Product price cannot be negative");
        }
    }

    @Override
    public double calculatePay() {
        return this.productQtySupplied * this.productPrice;
    }
}
