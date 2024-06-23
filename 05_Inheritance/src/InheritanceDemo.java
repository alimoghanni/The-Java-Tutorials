// 05_Inheritance/InheritanceDemo.java
/*
 * Inheritance
 * This program demonstrates inheritance in Java.
 */

// Super class
class Animal{
    // Field
    String name;

    // Constructor
    Animal(String name){
        this.name = name;
    }

    // Method
    void makeSound(){
        System.out.println("Some generic animal sound");
    }
}

// Subclass
class Dog extends Animal{
    // Constructor
    Dog(String name){
        super(name); // Call the constructor of the superclass
    }

    // Overriding the makeSound method
    @Override
    void makeSound(){
        System.out.println(name + " says: WOOF WOOF");
    }
}

// Subclass
class Cat extends Animal{
    // Constructor
    Cat(String name){
        super(name); // Call the constructor of the superclass
    }

    // Overriding the makeSound method
    @Override
    void makeSound(){
        System.out.println(name + " says: MEOW MEOW");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Catty");

        // Calling the overridden methods
        dog.makeSound();
        cat.makeSound();
    }
}
