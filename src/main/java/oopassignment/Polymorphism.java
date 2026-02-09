package oopassignment;

public class Polymorphism {
    public void greet() {
        System.out.println("Hello!");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static class Animal {
        public void sound() {
            System.out.println("Some sound...");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Woof woof!");
        }
    }
}
