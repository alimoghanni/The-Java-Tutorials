// 12_LambdaExpressions/LambdaExpressionsDemo.java
/*
 * Lambda Expressions
 * This program demonstrates the use of lambda expressions in Java.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionsDemo {
    public static void main(String[] args) {
        // Creating a list of strings
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Using lambda expression to iterate through the list
        System.out.println("Names in the list:");
        names.forEach(name -> System.out.println(name));

        // Using lambda expression with a functional interface
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
        System.out.println("\nNames in uppercase:");
        names.forEach(printUpperCase);

        // Using lambda expression with multiple statements
        Consumer<String> printLowerCase = name -> {
            String lowerCaseName = name.toUpperCase();
            System.out.println(lowerCaseName);
        };
        System.out.println("\nNames in lowercase:");
        names.forEach(printLowerCase);
    }
}
