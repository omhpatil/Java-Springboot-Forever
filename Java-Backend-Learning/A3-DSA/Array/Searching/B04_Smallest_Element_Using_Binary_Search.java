package DSA.Array.Searching;

public class B04_Smallest_Element_Using_Binary_Search {

    public static int binarySearch(int[] arr) {

        int start = 0, end = arr.length - 1;
        int smallest = Integer.MAX_VALUE;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};

        System.out.println("Smallest element in array is " + binarySearch(arr));

    }
}
