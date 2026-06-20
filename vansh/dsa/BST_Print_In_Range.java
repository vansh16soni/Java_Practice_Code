package vansh.dsa;

public class BST_Print_In_Range {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }

        // Case 1: Root data lies between x and y (inclusive)
        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }
        // Case 2: Root data is smaller than x → only right subtree may contain values ≥ x
        else if (root.data < x) {
            printInRange(root.right, x, y);
        }
        // Case 3: Root data is larger than y → only left subtree may contain values ≤ y
        else {
            printInRange(root.left, x, y);
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder traversal (sorted): ");
        inorder(root);
        System.out.println();

        System.out.print("Nodes in range [5, 12]: ");
        printInRange(root, 5, 12);
        System.out.println();

        System.out.print("Nodes in range [1, 4]: ");
        printInRange(root, 1, 4);
        System.out.println();

        System.out.print("Nodes in range [10, 14]: ");
        printInRange(root, 10, 14);
        System.out.println();
    }
}