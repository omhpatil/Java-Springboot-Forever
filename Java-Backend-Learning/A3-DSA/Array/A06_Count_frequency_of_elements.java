package DSA.Array;

import java.util.HashMap;
import java.util.Map;

public class A06_Count_frequency_of_elements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 3};
        HashMap<Integer, Integer> map = new HashMap<>();

        // for inserting elements into hashmap
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // printing elements from hashmap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
