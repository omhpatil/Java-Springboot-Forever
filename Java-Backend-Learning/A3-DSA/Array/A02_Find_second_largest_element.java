package DSA.Array;

public class A02_Find_second_largest_element {
    public static void main(String[] args) {

        int[] arr = {11, 12, 13, 14, 14, 15, 15};

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        System.out.println("Largest: " + largest + " and second largeat: " + second_largest);
    }
}
