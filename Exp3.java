  #3a                                                                              Student.java
class Student {
    String name;
    int age;
    double marks;

    // Default constructor
    Student() {
        name = "Not Assigned";
        age = 0;
        marks = 0.0;
    }

    // Parameterized constructor
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Marks: " + this.marks);
    }
}

class Main {
    public static void main(String[] args) {

        // Using default constructor
        Student std = new Student();
        std.display();

        System.out.println();

        // Using parameterized constructor
        Student std1 = new Student("Usha", 40, 67.8);
        std1.display();
    }
}
