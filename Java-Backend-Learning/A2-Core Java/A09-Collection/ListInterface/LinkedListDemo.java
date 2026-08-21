package CORE_JAVA.Collection.ListInterface;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.add(20);
        nums.addFirst(5);
        nums.addLast(30);

        System.out.println("LinkedList: " + nums);
    }
}

