package DSA.Tree;

// Traversal Using BFS (Level Order Traversal)

public class TreeDemo3 {

    int height(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    void printLevel(Node root, int level) {

        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(root.data + " ");
        } else {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }

    void LevelOrderTraversal(Node root) {

        int h = height(root);

        for (int level = 1; level <= h; level++) {
            printLevel(root, level);
        }
    }

    public static void main(String[] args) {
        // Create root
        Node root = new Node(10);

        // Children of 10
        root.left = new Node(20);
        root.right = new Node(30);

        // Children of 20
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        // Children of 30
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        TreeDemo3 tree = new TreeDemo3();
        tree.LevelOrderTraversal(root);
    }
}
