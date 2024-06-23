// 03_Methods/MethodsDemo.java
/*
 * Methods
 * This program demonstrates defining and calling methods in Java.
 */

public class MethodsDemo {
    public static void main(String[] args) {
        // Calling a method without parameters
        printHello();

        // Calling a method with parameters
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);

        // Calling a method that returns a value
        String message = getMessage("Java");
        System.out.println("Message: " + message);
    }


    // Method without parameters
    public static void printHello() {
        System.out.println("Hello, World!");
    }

    // Method with parameters
    public static int add(int a, int b){
        return a + b;
    }

    // Method that returns a value
    public static String getMessage(String name){
        return "Hello, " + name + "!";
    }
}
