package oopassignment;

public class Inheritance extends BaseModel {
    private String role;

    public Inheritance(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + role);
    }
}
