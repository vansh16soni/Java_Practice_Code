package vansh.dsa;

import java.util.ArrayList;

public class BST_Print_Root_Paths {

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
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int[] values = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println("\n");

        System.out.println("All root-to-leaf paths:");
        ArrayList<Integer> path = new ArrayList<>();
        printRoot2Leaf(root, path);
    }
}