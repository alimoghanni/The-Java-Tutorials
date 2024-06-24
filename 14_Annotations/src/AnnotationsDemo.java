// 14_Annotations/AnnotationsDemo.java
/*
 * Annotations
 * This program demonstrates the use of built-in and custom annotations in Java.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}

public class AnnotationsDemo {
    public static void main(String[] args) {
        // Using built-in annotations
        MyClass myClass = new MyClass();
        myClass.display();

        // Using custom annotation
        try {
            Method method = myClass.getClass().getMethod("myMethod");
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                System.out.println("MyAnnotation value: " + annotation.value());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    @Deprecated
    public void display() {
        System.out.println("Display method");
    }

    @MyAnnotation(value = "Hello, Annotation!")
    public void myMethod() {
        System.out.println("MyMethod");
    }
}
