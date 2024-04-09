package Exam2;

public class Main {
    public static void main(String[] args) {
        //Question 1
        Cloth[] clothes = new Cloth[]{
                new Cloth("Jeans", 35, Size.M),
                new Cloth("T-shirt", 20, Size.S),
                new Cloth("Hoodie", 50, Size.L)
        };
        //Question 2
        ShopApp.calculateSubTotal(clothes);

        //Question 3A
        Student student = new Student("Rene", Size.XL, 1234);
        Student student1 = new Student("Giselle", Size.S, 1235);

        //Question 3B
        student.printUniqueStudentID();
        student1.printUniqueStudentID();
        student.printUniqueStudentID();

        //Question 4
        student1.printInfo();

        //Question 5
        //Question 6
        Manager manager = new Manager("Mikaila", Size.M, 7000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Angel", Size.M, 40f, 25);
        Business business = new Business("Nike", 30, 80);
        //Question 7a
        Customer[] customers = new Customer[3];

        }
        //Question 7b:


    }

    }
