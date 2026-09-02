public class linkedList {

    // Node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class MyLinkedList {

        Node head;

        // Insert at beginning
        void insertAtBeginning(int data) {

            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;
        }

        // Insert at end
        void insertAtEnd(int data) {

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        // Delete from beginning
        void deleteFromBeginning() {

            if (head == null) {
                return;
            }

            head = head.next;
        }

        // Delete from end
        void deleteFromEnd() {

            if (head == null) {
                return;
            }

            if (head.next == null) {
                head = null;
                return;
            }

            Node temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
        }

        // Delete specific value
        void deleteValue(int value) {

            if (head == null) {
                return;
            }

            // Delete head
            if (head.data == value) {
                head = head.next;
                return;
            }

            Node temp = head;

            while (temp.next != null &&
                   temp.next.data != value) {

                temp = temp.next;
            }

            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }

        // Print linked list
        void printList() {

            Node temp = head;

            while (temp != null) {

                System.out.print(temp.data + " → ");

                temp = temp.next;
            }

            System.out.println("null");
        }
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        // Insert
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.printList();

        // Insert at beginning
        list.insertAtBeginning(5);

        list.printList();

        // Delete beginning
        list.deleteFromBeginning();

        list.printList();

        // Delete end
        list.deleteFromEnd();

        list.printList();

        // Delete specific value
        list.deleteValue(20);

        list.printList();
    }
}