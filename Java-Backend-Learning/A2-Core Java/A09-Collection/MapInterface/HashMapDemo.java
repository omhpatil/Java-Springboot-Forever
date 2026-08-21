package CORE_JAVA.Collection.MapInterface;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Om");
        map.put(2, "Patil");
        map.put(1, "Java"); // duplicate key → overwrites value

        System.out.println("HashMap: " + map);
    }
}


// Stores data in key-value pairs.
// Keys are unique, values can be duplicate.
