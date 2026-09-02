
class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class inOrder_trav {

    public static void inOrderTraversal(TreeNode root) {

        if (root == null) {
            return;
        }

        // Left
        inOrderTraversal(root.left);

        // Root
        System.out.print(root.value + " --> ");

        // Right
        inOrderTraversal(root.right);
    }

    public static void main(String args[]) {

        // Create a small tree
        //
        //          1
        //         / \
        //        2   3
        //       / \
        //      4   5

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Inorder Traversal:");

        inOrderTraversal(root);
    }
}
