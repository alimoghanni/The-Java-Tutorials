// 06_Polymorphism/PolymorphismDemo.java
/*
 * Polymorphism
 * This program demonstrates polymorphism in Java.
 */

class Animal{
    // Method
    void makeSound(){
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal{
    // Overriding the makeSound method
    @Override
    void makeSound(){
        System.out.println("WOOF WOOF!");
    }
}

class Cat extends Animal{
    // Overriding the makeSound method
    @Override
    void makeSound(){
        System.out.println("MEOW MEOW!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Creating objects of different subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Polymorphic behavior
        myDog.makeSound();
        myCat.makeSound();
    }
}
