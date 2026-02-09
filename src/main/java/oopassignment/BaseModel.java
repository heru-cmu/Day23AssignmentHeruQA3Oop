package oopassignment;

public class BaseModel {
    protected int id;
    protected String name;

    public BaseModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
