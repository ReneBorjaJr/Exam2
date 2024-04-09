package Exam2;

public class Cloth {
    private String name;
    private double price;
    private Size size;

    public Cloth(String name, double price, Size size) {
        this.name = name;
        this.price = price >= 0 ? price : 0;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price >= 0 ? price : this.price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
