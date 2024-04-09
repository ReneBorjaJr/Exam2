package Exam2;

import java.util.ArrayList;

public abstract class Customer extends Person {
    //Attribute
    private ArrayList<Cloth> clothingItems;

    //Constructor
    public Customer(String name, Size size) {
        super(name, size);
        this.clothingItems = new ArrayList<>();
    }

    public void printPriceAfterDiscount(Cloth cloth) {
        System.out.println("Price for the cloth item: $" + cloth.getPrice());
    }
}
