// 11_Multithreading/MultithreadingDemo.java
/*
 * Multithreading
 * This program demonstrates the use of threads in Java.
 */

// Implementing Runnable Interface
class MyRunnable implements Runnable {
    private String threadName;

    MyRunnable(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " exiting.");
    }
}


public class MultithreadingDemo {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // Creating threads
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        // Starting threads
        thread1.start();
        thread2.start();

        try {
            // Waiting for threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread ending.");
    }
}
