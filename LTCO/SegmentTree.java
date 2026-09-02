class SegmentTree {

  public static void main(String[] args) {
    int arr[] = {3, 8, 6, 7, -2, -8, 4, 9};
    SegmentTree tree = new SegmentTree(arr);

    System.out.println("Tree Structure:");
    tree.display();

    System.out.println("\nQuery(2, 6): " + tree.query(2, 6));
    tree.update(3, 10); // change index 3 from 7 to 10
    System.out.println("\nAfter update(3, 10):");
    tree.display();
    System.out.println("\nQuery(2, 6): " + tree.query(2, 6));
  }

  private static class Node {
    int data;
    int startInterval;
    int endInterval;
    Node left;
    Node right;

    public Node(int startInterval, int endInterval) {
      this.startInterval = startInterval;
      this.endInterval = endInterval;
    }
  }

  private Node root;

  public SegmentTree(int[] arr) {
    this.root = constructTree(arr, 0, arr.length - 1);
  }

  private Node constructTree(int[] arr, int start, int end) {
    if (start == end) {
      Node leaf = new Node(start, end);
      leaf.data = arr[start];
      return leaf;
    }

    Node node = new Node(start, end);
    int mid = (start + end) / 2;

    node.left = this.constructTree(arr, start, mid);
    node.right = this.constructTree(arr, mid + 1, end);

    node.data = node.left.data + node.right.data;
    return node;
  }

  public void display() {
    display(this.root);
  }

  private void display(Node node) {
    if (node == null) return;

    String str = "";

    if (node.left != null) {
      str += "Interval [" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
    } else {
      str += "No left child => ";
    }

    str += "[ " + node.startInterval + "-" + node.endInterval + " ] => ";

    if (node.right != null) {
      str += "Interval [" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
    } else {
      str += "No right child";
    }

    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public int query(int qsi, int qei) {
    return this.query(this.root, qsi, qei);
  }

  private int query(Node node, int qsi, int qei) {
    // Complete Overlap
    if (node.startInterval >= qsi && node.endInterval <= qei) {
      return node.data;
    }

    // No Overlap
    if (node.endInterval < qsi || node.startInterval > qei) {
      return 0;
    }

    // Partial Overlap
    int leftAns = query(node.left, qsi, qei);
    int rightAns = query(node.right, qsi, qei);
    return leftAns + rightAns;
  }

  public void update(int index, int value) {
    update(this.root, index, value);
  }

  private int update(Node node, int index, int value) {
    if (index >= node.startInterval && index <= node.endInterval) {
      if (node.startInterval == node.endInterval) {
        node.data = value;
        return node.data;
      } else {
        int leftAns = update(node.left, index, value);
        int rightAns = update(node.right, index, value);
        node.data = leftAns + rightAns;
        return node.data;
      }
    }
    return node.data;
  }
}
