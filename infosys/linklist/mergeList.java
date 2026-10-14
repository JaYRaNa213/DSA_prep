public class mergeList {

  

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Create Linked List
    static Node createList(int[] arr) {

      Node head = new Node(arr[0]);

      Node temp = head;
       for ( int i = 0 ; i < arr.length; i ++){
        temp.next = new Node( arr[i]);
        temp = temp.next;
       }

       return head;

    }

    // Print Linked List

    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Merge two sorted Linked Lists
    static Node merge(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            } 
            temp = temp.next;
        }

        // Attach remaining nodes
        if (l1 != null) {
            temp.next = l1;
        }

        if (l2 != null) {
            temp.next = l2;
        }

        return dummy.next;
    }

    // Sort Linked List using Merge Sort
    static Node sortList(Node head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }
        // Find middle
        Node slow = head;
        Node fast =  head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Split the list
        Node right = slow.next;
        slow.next = null;
        // Sort left half
        Node left = sortList(head);
        right = sortList(right);
        return merge(left, right);
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 1, 3, 5};

        Node head = createList(arr);

        System.out.println("Original Linked List:");
        printList(head);

        head = sortList(head);

        System.out.println("Sorted Linked List:");
        printList(head);
    }
}
  

