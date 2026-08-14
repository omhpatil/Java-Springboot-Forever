package DSA.Array;

public class A08_Move_all_zeros_to_the_end {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            result[index] = arr[i];
            index++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}