package oopassignment;

public class Main {
    public static void main(String[] args) {
        // Encapsulation
        Encapsulation e = new Encapsulation();
        e.setSecret("My Password");
        System.out.println("Secret: " + e.getSecret());

        // Inheritance
        Inheritance i = new Inheritance(1, "Heru", "QA Engineer");
        i.displayInfo();

        // Abstraction
        Worker w = new Worker();
        w.work();
        w.rest();

        // Polymorphism
        Polymorphism p = new Polymorphism();
        p.greet();
        p.greet("Heru");

        Polymorphism.Animal a = new Polymorphism.Animal();
        Polymorphism.Dog d = new Polymorphism.Dog();
        a.sound();
        d.sound();
    }
}
