package CORE_JAVA.Multithreding;

class RunnableClass implements Runnable{
    public void run(){
        System.out.println("Current thread running: "+Thread.currentThread().getName());
    }
}

public class UsingRunnableImplements {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableClass());
        Thread t2 = new Thread(new RunnableClass());

        t1.start();
        t2.start();
    }
}
