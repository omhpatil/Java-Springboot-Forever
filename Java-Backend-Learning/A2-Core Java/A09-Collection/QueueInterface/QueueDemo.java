package CORE_JAVA.Collection.QueueInterface;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(30);
        q.add(10);
        q.add(20);

        System.out.println("Queue: " + q);
        System.out.println("Head: " + q.peek());
        q.remove();
        System.out.println("After remove: " + q);
    }
}


// Follows FIFO (First In First Out)
// Used for storing elements in a sequence.