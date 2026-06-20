package vansh.dsa;

public class Binary_Tree_Diameter {

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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Approach 1: O(n²) – computes height repeatedly
    public static int diameter1(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter1(root.left);
        int diam3 = diameter1(root.right);
        return Math.max(diam1, Math.max(diam2, diam3));
    }


    static class TreeInfo {
        int height;
        int diam;

        TreeInfo(int height, int diam) {
            this.height = height;
            this.diam = diam;
        }
    }

    // Approach 2: O(n) – single traversal, returns both height and diameter
    public static TreeInfo diameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTI = diameter(root.left);
        TreeInfo rightTI = diameter(root.right);

        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;

        int diam1 = leftTI.height + rightTI.height + 1;
        int diam2 = leftTI.diam;
        int diam3 = rightTI.diam;

        int myDiam = Math.max(diam1, Math.max(diam2, diam3));

        return new TreeInfo(myHeight, myDiam);
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree.idx = -1;
        Node root = BinaryTree.buildTree(nodes);

        System.out.println("Diameter of the given Tree by Approach 1 : " + diameter1(root));
        System.out.println("Diameter of the given Tree by Approach 2 : " + diameter(root).diam);
    }
}