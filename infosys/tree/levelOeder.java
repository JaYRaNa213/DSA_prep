import java.util.Queue;
import java.util.LinkedList;

public class levelOeder {
    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    


    // Level Order Traversal
    public static void levelOrderTraversal(TreeNode root) {
        // Create a Queue
        Queue<TreeNode> queue = new LinkedList<>();
        if ( root == null) {
            return;
        }
        queue.offer( root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for ( int i = 0 ; i < size ; i ++){
            TreeNode treeNode = queue.poll();
             // Normal lavel order traversal
            System.out.print(treeNode.val+"--> ");
             // Print the last element of each level
            //  if ( i == size-1){
            //     System.out.print(treeNode.val + " --> ");
            //  }   
            if ( treeNode.left!= null){
                queue.offer(treeNode.left);
            }
            if( treeNode.right != null){
                queue.offer(treeNode.right);
            }
            }
        }
    }

    public static void main(String[] args) {

        /*
                 2
               /   \
              8     4
             / \     \
            3   7     1
                     /
                    6
        */

        // Create nodes
        TreeNode root = new TreeNode(2);

        root.left = new TreeNode(8);
        root.right = new TreeNode(4);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.right = new TreeNode(1);

        root.right.right.left = new TreeNode(6);

        // Perform Level Order Traversal
        levelOrderTraversal(root);
    }
}