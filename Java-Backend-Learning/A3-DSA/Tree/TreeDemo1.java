package DSA.Tree;

public class TreeDemo1 {

    int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.left.left = new Node(50);

        TreeDemo1 demo = new TreeDemo1();
        System.out.print(demo.heightOfTree(root));
    }
}


//        | Complexity              | Answer     |
//        | ----------------------- | ---------- |
//        | **Time**                | `O(n)`     |
//        | **Auxiliary Space**     | `O(h)`     |
//        | **Balanced tree space** | `O(log n)` |
//        | **Skewed tree space**   | `O(n)`     |