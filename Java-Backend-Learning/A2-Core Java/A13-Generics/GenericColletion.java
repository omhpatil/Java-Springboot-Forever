package CORE_JAVA.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericColletion {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Type-safe
        list.add("Ram");
        list.add("Shyam");
    // list.add(10); // Compile-time error

        for (String str : list){
            System.out.println(str);
        }

    }
}
