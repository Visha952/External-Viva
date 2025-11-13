// Base class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Derived class (Single Inheritance)
class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Another derived class (Multilevel Inheritance)
class GraduateStudent extends Student {
    String specialization;

    GraduateStudent(String name, int age, int rollNumber, String specialization) {
        super(name, age, rollNumber);
        this.specialization = specialization;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent("Vishal", 22, 101, "Computer Science");
        gs.displayDetails();
    }
}
