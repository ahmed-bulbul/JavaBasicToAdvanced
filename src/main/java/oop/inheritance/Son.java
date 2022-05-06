package oop.inheritance;

public class Son extends Father{

    public Son(String name, int age, String address) {
        super(name, age, address);
    }

    private String computer;

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void print() {
        System.out.println("Father name: " + getName());
    }
}
