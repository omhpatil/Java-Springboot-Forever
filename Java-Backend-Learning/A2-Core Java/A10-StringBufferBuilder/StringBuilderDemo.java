package CORE_JAVA.StringBufferBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        sb.append(" from");
        sb.append(" Java");

        System.out.println(sb); // Output: Hello World from Java
    }
}
