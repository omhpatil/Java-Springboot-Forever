package DSA.Array;

public class A05_Check_if_array_is_sorted {

    public static boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15};
        boolean result = isArraySorted(arr);
        System.out.println("Is array is sorted: " + result);
    }
}
