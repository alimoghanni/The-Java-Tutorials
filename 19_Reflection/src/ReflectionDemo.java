// 19_Reflection/ReflectionDemo.java
/*
 * Reflection API
 * This program demonstrates the use of Java Reflection API to inspect and manipulate classes at runtime.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // Obtain the Class object associated with ExampleClass
            Class<?> clazz = Class.forName("ExampleClass");

            // Print class name
            System.out.println("Class Name: " + clazz.getName());

            // Print declared fields
            Field[] fields = clazz.getDeclaredFields();
            System.out.println("\nDeclared Fields:");
            for (Field field : fields) {
                System.out.println("  " + field.getName() + " (" + field.getType().getName() + ")");
            }

            // Print declared methods
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("\nDeclared Methods:");
            for (Method method : methods) {
                System.out.println("  " + method.getName() + " (Return type: " + method.getReturnType().getName() + ")");
            }

            // Print declared constructors
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            System.out.println("\nDeclared Constructors:");
            for (Constructor<?> constructor : constructors) {
                System.out.println("  " + constructor.getName() + " (Parameter count: " + constructor.getParameterCount() + ")");
            }

            // Create an instance of ExampleClass
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            Object instance = constructor.newInstance();

            // Access and modify a private field
            Field privateField = clazz.getDeclaredField("privateField");
            privateField.setAccessible(true);
            privateField.set(instance, "Modified Private Field");

            // Invoke a private method
            Method privateMethod = clazz.getDeclaredMethod("privateMethod");
            privateMethod.setAccessible(true);
            privateMethod.invoke(instance);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

class ExampleClass {
    public String publicField = "Public Field";
    private String privateField = "Private Field";

    public ExampleClass() {
        System.out.println("Public Constructor");
    }

    private ExampleClass(String value) {
        System.out.println("Private Constructor with value: " + value);
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }
}
