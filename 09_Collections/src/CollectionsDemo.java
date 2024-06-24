// 09_Collections/CollectionsDemo.java
/*
 * Collections Framework
 * This program demonstrates the use of collections in Java.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionsDemo {
    public static void main(String[] args) {
        // List example
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // Duplicates are allowed

        System.out.println("List: " + list);

        // Set example
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicates are not allowed, this will be ignored

        System.out.println("Set: " + set);

        // Map example
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(1, "Apricot"); // The value for key 1 will be replaced

        System.out.println("Map: " + map);

        // Retrieving elements from a Map
        String value = map.get(2);
        System.out.println("Value at key 2: " + value);
    }
}
