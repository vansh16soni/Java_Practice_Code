package vansh.dsa;

public class Binary_Search_Tree_Deletion {

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

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        return (root.data > key) ? search(root.left, key) : search(root.right, key);
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }

        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {

            // Case 1: No child (leaf)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node IS = findInorderSuccessor(root.right);   // left‑most in right subtree
            root.data = IS.data;                          // copy successor's data
            root.right = delete(root.right, IS.data);     // delete successor
        }
        return root;
    }

    public static void main(String[] args) {
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        Node root = null;


        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Initial inorder: ");
        inorder(root);
        System.out.println();


        root = delete(root, 2);
        System.out.print("After deleting 2: ");
        inorder(root);
        System.out.println();


        root = delete(root, 3);
        System.out.print("After deleting 3: ");
        inorder(root);
        System.out.println();


        root = delete(root, 5);
        System.out.print("After deleting 5: ");
        inorder(root);
        System.out.println();

        System.out.println("Search for 4: " + search(root, 4));   // true
        System.out.println("Search for 5: " + search(root, 5));   // false (deleted)
    }
}