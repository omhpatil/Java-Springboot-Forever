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