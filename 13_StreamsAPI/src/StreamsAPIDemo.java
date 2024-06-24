// 13_StreamsAPI/StreamsAPIDemo.java
/*
 * Streams API
 * This program demonstrates the use of Streams API in Java.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPIDemo {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Using Streams API to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        // Using Streams API to map numbers to their squares
        List<Integer> squares = numbers.stream()
                                        .map(n -> n * n)
                                        .collect(Collectors.toList());

        System.out.println("Squares: " + squares);

        // Using Streams API to sum all numbers
        int sum = numbers.stream().reduce(0, (a,b) -> a + b);
        System.out.println("Sum of Numbers: " + sum);

        // Using Streams API to find the maximum number
        int max = numbers.stream().max(Integer::compare).get();
        System.out.println("Max Number: " + max);
    }
}
