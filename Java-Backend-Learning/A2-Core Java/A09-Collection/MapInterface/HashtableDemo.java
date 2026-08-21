package CORE_JAVA.Collection.MapInterface;

import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Java");
        table.put(2, "Spring");
        // table.put(null, "Error"); // ❌ not allowed

        System.out.println("Hashtable: " + table);
    }
}



// Similar to HashMap but thread-safe (synchronized)
// Doesn’t allow null key or value