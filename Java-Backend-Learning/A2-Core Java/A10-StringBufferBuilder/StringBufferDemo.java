package CORE_JAVA.StringBufferBuilder;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Start");

        // Two threads modifying the same StringBuffer
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sb.append(" A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sb.append(" B");
            }
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(sb);
    }
}
