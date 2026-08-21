package CORE_JAVA.Collection.SetInterface;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Pune"); // duplicate ignored

        System.out.println("HashSet: " + cities);
    }
}




//No duplicates allowed.
//Unordered collection.