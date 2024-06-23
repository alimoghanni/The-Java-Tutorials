// 08_ExceptionHandling/ExceptionHandlingDemo.java
/*
 * Exception Handling
 * This program demonstrates exception handling in Java.
 */

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // Handling exception with try-catch
        try {
            int [] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }

        // Handling multiple exceptions
        try {
            int result = divide(10, 0); // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    // Method that throws an exception
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
