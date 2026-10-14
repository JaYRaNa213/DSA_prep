import java.util.*;

public class VerticalTraversal {

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

    // Pair = Node + Column
    static class Pair {

        TreeNode node;
        int column;

        Pair(TreeNode node, int column) {
            this.node = node;
            this.column = column;
        }
    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // column -> nodes
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        // Queue contains Node + Column
        Queue<Pair> queue = new LinkedList<>();

        // Root is at column 0
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            TreeNode node = current.node;
            int column = current.column;

            // Put node into its column
            map.putIfAbsent(column, new ArrayList<>());
            map.get(column).add(node.val);

            // Left child -> column - 1
            if (node.left != null) {

                queue.offer(
                    new Pair(node.left, column - 1)
                );
            }

            // Right child -> column + 1
            if (node.right != null) {

                queue.offer(
                    new Pair(node.right, column + 1)
                );
            }
        }

        // TreeMap automatically gives columns
        // from smallest to largest
        for (List<Integer> list : map.values()) {

            result.add(list);
        }

        return result;
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

        TreeNode root = new TreeNode(2);

        root.left = new TreeNode(8);
        root.right = new TreeNode(4);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        root.right.right = new TreeNode(1);

        root.right.right.left = new TreeNode(6);

        List<List<Integer>> result =
                verticalTraversal(root);

        System.out.println(result);
    }
}