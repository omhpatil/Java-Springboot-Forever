package DSA.Tree;

import java.sql.Time;

public class TreeDemo2 {

    void printNodeAtDistanceK(Node root, int k) {
        if (root == null) return;
        if (k == 0) System.out.print(root.data + " ");
        else {
            printNodeAtDistanceK(root.left, k - 1);
            printNodeAtDistanceK(root.right, k - 1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(60);
        root.right.right.right = new Node(70);

        TreeDemo2 demo = new TreeDemo2();
        demo.printNodeAtDistanceK(root, 2);
    }
}

//        | Complexity             | Answer         |
//        | ---------------------- | -------------- |
//        | **Time**               | `O(2^k)`       |
//        | **Worst-case Time**    | `O(n)`         |
//        | **Auxiliary Space**    | `O(k)`         |
//        | **More precise Space** | `O(min(k, h))` |