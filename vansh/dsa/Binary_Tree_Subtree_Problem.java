package vansh.dsa;

public class Binary_Tree_Subtree_Problem {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
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

    public boolean isIdentical(Node root, Node subRoot) {
        if (subRoot == null && root == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            return isIdentical(root.left, subRoot.left) &&
                    isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(Node root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (isIdentical(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) ||
                isSubtree(root.right, subRoot);
    }

    public static void main(String args[]) {
        int mainNodes[] = {3, 4, 5, -1, -1, 1, -1, -1, 2, -1, -1};
        BinaryTree.idx = -1;
        Node mainRoot = BinaryTree.buildTree(mainNodes);

        int subNodes[] = {4, 5, -1, -1, 1, -1, -1};
        BinaryTree.idx = -1;
        Node subRoot = BinaryTree.buildTree(subNodes);

        Binary_Tree_Subtree_Problem checker = new Binary_Tree_Subtree_Problem();
        boolean result = checker.isSubtree(mainRoot, subRoot);
        System.out.println("Is subRoot a subtree of mainRoot? " + result);

        int subNodes2[] = {4, 5, -1, -1, 2, -1, -1};
        BinaryTree.idx = -1;
        Node subRoot2 = BinaryTree.buildTree(subNodes2);
        boolean result2 = checker.isSubtree(mainRoot, subRoot2);
        System.out.println("Is subRoot2 a subtree of mainRoot? " + result2);
    }
}