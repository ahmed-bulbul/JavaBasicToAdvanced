package dependencyInjection;

public class Student {

    private String name;



    // constructor injection
    public Student() {
    }

    public String getName() {
        return name;
    }

    // setter injection
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }
    public void display() {
        System.out.println("Name: " + name);
    }
}
