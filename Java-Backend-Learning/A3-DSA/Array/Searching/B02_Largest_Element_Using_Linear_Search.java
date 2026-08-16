package DSA.Array.Searching;

public class B02_Largest_Element_Using_Linear_Search {

    public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Largest element in array is: " + findLargest(arr));
    }
}