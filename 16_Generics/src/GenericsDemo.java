// 16_Generics/GenericsDemo.java
/*
 * Generics
 * This program demonstrates the use of generics in Java.
 */

import java.util.ArrayList;
import java.util.List;

// Generic class
class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

// Generic method
public class GenericsDemo {
    public static void main(String[] args) {
        // Using a generic class
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println("Integer Value: " + integerBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!");
        System.out.println("String Value: " + stringBox.get());

        // Using a generic method
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println("Sum of integer list: " + sumOfList(integerList));

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);
        System.out.println("Sum of double list: " + sumOfList(doubleList));
    }

    // Generic method to sum numbers in a list
    public static <T extends Number> double sumOfList(List<T> list) {
        double sum = 0.0;
        for (T number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
