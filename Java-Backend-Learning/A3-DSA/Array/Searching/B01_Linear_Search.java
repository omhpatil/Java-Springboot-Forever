package DSA.Array.Searching;

public class B01_Linear_Search {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 5;

        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Key Not Found");
        } else {
            System.out.println("Key Found At Index: " + index);
        }
    }
}
