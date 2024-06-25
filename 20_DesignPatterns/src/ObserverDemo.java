// 20_DesignPatterns/ObserverDemo.java
/*
 * Observer Pattern
 * This pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
 */

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(String message);
}

// Subject class
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}

// Concrete observer classes
class ObserverA implements Observer {
    public void update(String message) {
        System.out.println("ObserverA received message: " + message);
    }
}

class ObserverB implements Observer {
    public void update(String message) {
        System.out.println("ObserverB received message: " + message);
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();

        subject.addObserver(observerA);
        subject.addObserver(observerB);

        subject.setMessage("Hello, Observers!");
    }
}
