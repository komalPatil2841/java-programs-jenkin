public class Student {
    private String name;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }
}