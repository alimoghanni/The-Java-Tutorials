// 04_OOP/OOPDemo.java
/*
 * Object-Oriented Programming (OOP)
 * This program demonstrates classes and objects in Java.
 */

class Person {
    // Fields
    String name;
    int age;

    // Constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Calling the method on the objects
        person1.displayInfo();
        person2.displayInfo();
    }
}
