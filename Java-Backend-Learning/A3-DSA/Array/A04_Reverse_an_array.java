package DSA.Array;

public class A04_Reverse_an_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//        System.out.print("Original array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.print("\nReversed array: ");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }


        // two-pointer technique
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
