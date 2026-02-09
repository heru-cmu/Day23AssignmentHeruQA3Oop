package oopassignment;

abstract class AbstractClass {
    abstract void work();

    public void rest() {
        System.out.println("Taking a break...");
    }
}

class Worker extends AbstractClass {
    @Override
    void work() {
        System.out.println("Worker is working hard!");
    }
}
