// 07_Interfaces/InterfacesDemo.java
/*
 * Interfaces
 * This program demonstrates the use of interfaces in Java.
 */

// Defining an interface
interface Animal {
    void makeSound();
    void eat();
}

// Implementing the interface in the Dog class
class Dog implements Animal {
    @Override
    public void makeSound(){
        System.out.println("WOOF WOOF!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

// Implementing the interface in the Cat class
class Cat implements Animal {
    @Override
    public void makeSound(){
        System.out.println("MEOW MEOW");
    }

    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }
}


public class InterfacesDemo {
    public static void main(String[] args) {
        // Creating objects of the classes that implement the interface
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the interface methods
        myDog.makeSound();
        myDog.eat();

        myCat.makeSound();
        myCat.eat();
    }
}
