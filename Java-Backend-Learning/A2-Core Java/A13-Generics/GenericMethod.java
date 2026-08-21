package CORE_JAVA.Generics;

class Util {
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        String[] names = {"Ram", "Shyam"};

        Util.printArray(nums);
        Util.printArray(names);
    }
}
