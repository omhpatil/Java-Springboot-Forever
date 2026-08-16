package DSA.Array;

public class A07_Remove_duplicates_from_sorted_array {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};

//        // Using HashSet which stores only unique values
//        HashSet set = new HashSet();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        System.out.println(set);

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
