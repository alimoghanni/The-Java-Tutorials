// 02_ControlFlow/ControlFlowDemo.java
/*
 * Control Flow Statements
 * This program demonstrates the use of control flow statements in Java.
 */

public class ControlFlowDemo {
    public static void main(String[] args) {
        // If-else statement
        int number = 10;
        if (number > 0){
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is non-positive.");
        }

        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        // While loop
        System.out.println("While loop:");
        int count = 0;
        while (count < 5){
            System.out.println(count);
            count++;
        }

        // Do-while loop
        System.out.println("Do-while loop:");
        int doCount = 0;
        do {
            System.out.println(doCount);
            doCount++;
        } while (doCount < 5);

        // Switch statement
        System.out.println("Switch statement");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Teusday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sundat");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
