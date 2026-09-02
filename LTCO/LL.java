class Node{
  int val;
  Node next;

  Node (int val){
    this.val = val;
    this.next = null;
  }
}



class LL{



  public static void main(String [] args){

    insertBeg(10);
    insertBeg(20);  
    insertEnd(30);
    insertEnd(40);

    display();
  }



  Node head;

  public void insertBeg(int val){
    Node newNode = new Node(val);
    newNode.next= head;
    head = newNode;
  }

  public void insertEnd(int val){

    Node newNode = new Node(val);
    if (head == null){
      head = newNode;
      return;
    }

    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
    newNode.next = null;
  }


  public display(){


    if (head == null){
      console.log("List is empty");
    }


    Node temp = head;
    while(temp!= null){

      console.log(temp.val);
      temp = temp.next;
    }

    console.leg(:end);

  }

  }

}