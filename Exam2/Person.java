package Exam2;

public abstract class Person {
    private String name;
    private Size size;

    public Person(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    void printInfo() {
        System.out.println("Exam2.Person name: " + this.name);
        System.out.println("Exam2.Person size: " + this.size);
    }
}
