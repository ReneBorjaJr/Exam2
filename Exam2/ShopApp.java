package Exam2;

public class ShopApp {
    public static boolean isAFit (Customer customer, Cloth cloth) {
        if (customer.getSize().equals(cloth.getSize())) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static double calculateSubTotal(Cloth[] cloths) {
        double subTotal = 0.0;
        System.out.println("Item Prices:");
        for (Cloth clothes : cloths) {
            System.out.println("$" + clothes.getPrice());
            subTotal += clothes.getPrice();
        }
        System.out.println("Subtotal: $" + subTotal);
        return subTotal;

    }

    public static void printClassNamesOfPayableEntities(Payable[] payables) {
        for (Payable payable : payables) {
            System.out.println(payable.getClass().getSimpleName());
        }
    }
}
