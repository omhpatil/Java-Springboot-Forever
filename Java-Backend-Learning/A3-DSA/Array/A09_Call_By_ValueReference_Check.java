package DSA.Array;

public class A09_Call_By_ValueReference_Check {

    private static void update(int[] arr, int nonChangable) {
        nonChangable = 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 100;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int nonChangable = 7;

        update(arr, nonChangable);
        System.out.println(nonChangable);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



// Explaination: Java is always pass-by-value. For primitives, a copy of the value is passed;
// for objects and arrays, a copy of the reference is passed. Modifying the object affects the original object,
// but reassigning the copied reference does not affect the original reference.

//Java Method Call
//                       |
//                               ↓
//PASS BY VALUE
//                       |
//                               ┌──────────┴──────────┐
//                               ↓                     ↓
//Primitive               Object/Array
//            |                     |
//copy of value        copy of reference
//            |                     |
//                    ↓                     ↓
//original unchanged    same object is shared
//                                  |
//                                          ┌────────┴────────┐
//                                          ↓                 ↓
//modify object      reassign reference
//                         |                 |
//                                 ↓                 ↓
//original changes    original unchanged
//
//For primitive variables, Java passes a copy of the value. If we change that copy, the original variable does not change.
//
//For objects/arrays, Java passes a copy of the reference. Both the original reference and copied reference point to the same object. So, if we modify the object's data, the original object changes. But if we change/reassign the copied reference, the original reference does not change.
