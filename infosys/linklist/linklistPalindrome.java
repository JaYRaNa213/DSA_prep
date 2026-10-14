public class linklistPalindrome {

  static class Node {
    int data ;
    Node next;

    Node (int data){
      this.data =data;
      this.next=null;
    }
  }
  public static Node createList(int arr[]){

    Node head = new Node(arr[0]);
    Node temp = head;
    for ( int i = 1; i < arr.length; i++){
      temp.next = new Node(arr[i]);
      temp = temp.next;
    }

    return head;
    
  }

  static void printList(Node head){

    Node temp = head;
    while ( temp!= null){
      System.out.print(temp.data+"--> ");
      temp = temp.next;
    }
    System.out.print("null ");



  }


  public static Node reverse( Node head){
    Node prev = null;
    Node temp = head;

    while ( temp!= null){
      Node nextTemp = temp.next ;
      temp.next=prev;
      prev = temp;
      temp = nextTemp;
    }
     return prev;
  }
  public static boolean isPalindrome(Node head){

    // head -> 1--> 2--> 3--> 2--> 1--> null

    if ( head == null || head.next==null){
      return true;
    }
    
    Node slow = head;
    Node fast = head;

    while ( fast!= null && fast.next!= null){
      slow = slow.next;
      fast = fast.next.next;
    }

    Node secondHalf = reverse(slow);

    Node firstHalf = head;

    while ( secondHalf!= null){
      if ( firstHalf.data != secondHalf.data){
        return false;
      }

      firstHalf = firstHalf.next;
      secondHalf = secondHalf.next;
    }

    
    return true;
  }

  public static void main(String[] args) {
    int arr [] = { 1 ,2 ,3,2,1};

    Node head = createList(arr);

    printList(head);



  }


  
  
}
