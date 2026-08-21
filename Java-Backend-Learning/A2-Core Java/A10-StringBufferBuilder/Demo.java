package CORE_JAVA.StringBufferBuilder;

public class Demo {
    public static void main(String[] args) {
        // String (immutable)
        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s); // Output: Hello

        // StringBuilder (mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb); // Output: Hello World

        // StringBuffer (mutable + thread-safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" Java");
        System.out.println("StringBuffer: " + sbf); // Output: Hello Java
    }
}



// Why we need them:
// If you need to modify strings frequently (like in loops or concatenation),
// then using normal String is inefficient, because it creates many new objects in memory.

// So Java provides:
// 1. StringBuilder (faster, not thread-safe)
// 2. StringBuffer (slower, thread-safe — synchronized)


//| Feature     | String                              | StringBuilder               | StringBuffer                    |
//        | ----------- | ----------------------------------- | --------------------------- | ------------------------------- |
//        | Mutability  | Immutable                           | Mutable                     | Mutable                         |
//        | Thread-safe | ❌ No                                | ❌ No                        | ✅ Yes                           |
//        | Performance | Slow (creates new object each time) | Fast                        | Slower (due to synchronization) |
//        | Use Case    | When value doesn’t change           | When frequent modifications | When thread safety is needed    |
