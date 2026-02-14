package oopassignment;

public abstract class AbstractClass {
    public abstract void work();

    public void rest() {
        System.out.println("Taking a break...");
    }
}

class Worker extends AbstractClass {
    @Override
    public void work() {
        System.out.println("Worker is working hard!");
    }
}

