package DSA.Tree;

class Node {
    int data;

    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;   // unintialzed members are bydefault null in java so no need to write this two lines
        this.right = null;
    }
}

//                            10
//                          /    \
//                        20      30
//                       /  \    /  \
//                     40   50  60   70

public class TreeDemo {

    void PreOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    void InOrder(Node root) {
        if (root != null) {
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
    }

    void PostOrder(Node root) {
        if (root != null) {
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {

        // Create root
        Node root = new Node(10);

        // Create left and right child of 10
        root.left = new Node(20);
        root.right = new Node(30);

        // Create children of 20
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        // Create children of 30
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        // Create TreeDemo object
        TreeDemo tree = new TreeDemo();

        // Performing Traversal
        System.out.print("PreOrder Traversal: ");
        tree.PreOrder(root);


        System.out.print("\nInOrder Traversal: ");
        tree.InOrder(root);

        System.out.print("\nPostOrder Traversal: ");
        tree.PostOrder(root);


    }
}