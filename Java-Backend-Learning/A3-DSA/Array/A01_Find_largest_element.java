package DSA.Array;

import java.util.Scanner;

public class A01_Find_largest_element {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // find largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest elemetn in the array is: " + largest);
    }
}