package DSA.Array;

public class A03_Find_smallest_and_second_smallest {
    public static void main(String[] args) {

        int[] arr = {11, 11, 12, 12, 13, 14, 15};

        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                second_smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < second_smallest && arr[i] != smallest) {
                second_smallest = arr[i];
            }
        }
        System.out.println("Smallest: " + smallest + " and second smallest: " + second_smallest);

    }
}
