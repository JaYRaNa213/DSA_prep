public class mergeTwoSortedList {
  static class Node {
    int data ;
    Node next;
    Node ( int data ){

      this.data = data;
      this.next = next;
    }
  }

  public static Node createList(int []arr){
    Node head = new Node(arr[0]);
    Node temp  = head;
    for ( int  i = 1 ; i < arr.length; i++){
      temp.next = new Node (arr[i]);
      temp = temp.next;
    }
    return head;
  }



  public static void printList ( Node head){

    Node temp = head;

    while ( temp!= null){
      System.out.print(temp.data+"--> ");
      temp  = temp.next;
    }
    System.out.println(" null");

  }


  public static Node mergeList(Node l1 , Node l2){

    Node dummy = new Node (0);
    Node temp = dummy;

    while ( l1!= null && l2!= null){

      if( l1.data<= l2.data){
        temp.next= l1;
        l1 = l1.next;
      }else{
        temp.next = l2;
        l2 = l2.next;
      }
      temp = temp.next;
    }

    if(l1!= null){
      temp.next= l1;
    }
    if ( l2!= null){
      temp.next= l2;
    }

    return dummy.next ;
  }

  public static void main(String[] args) {
    int []arr1= {1 ,3,5};

    int []arr2 = { 2 ,4 ,6,7,8};
    
    Node head1= createList(arr1);
    Node head2 = createList(arr2);

    printList(head1);
    printList(head2);

    Node headMerged = mergeList(head1,head2);
    printList(headMerged);
    }
}
