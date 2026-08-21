package CORE_JAVA.Multithreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            service.execute(() -> {
                System.out.println("Task executed by " + Thread.currentThread().getName());
            });
        }

        service.shutdown();
    }
}

