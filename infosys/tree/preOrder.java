


class TreeNode{

  int value;
  TreeNode left;
  TreeNode right;

  TreeNode (int value){
    this.value = value;
    this.left = null;
    this.right = null;
  }
}

public class preOrder {

  public static void preOrderTraversal( TreeNode root){

    if ( root == null){
      return ;
    }

    System.out.print(root.value +"-> ");

    preOrderTraversal(root.left);

    preOrderTraversal(root.right);

  }

  public static void main ( String args[]){


    TreeNode root =new  TreeNode(1);

    root.left = new TreeNode(2);
    root.right = new TreeNode( 3);

    root.right.left = new TreeNode ( 5);
    root.right.right = new TreeNode ( 6);


    System.out.println("Inorder Traversal:");

        preOrderTraversal(root);




  }






  
}
