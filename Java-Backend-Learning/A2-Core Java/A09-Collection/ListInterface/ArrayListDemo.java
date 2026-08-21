package CORE_JAVA.Collection.ListInterface;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Om");
        names.add("Patil");
        names.add("Om"); // duplicate allowed

        System.out.println("ArrayList: " + names);
    }
}



// Ordered collection (index-based)
// Allows duplicate elements