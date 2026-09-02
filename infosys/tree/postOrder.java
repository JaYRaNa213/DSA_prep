

class TreeNode {

  int val ;
  TreeNode left;
  TreeNode right;


  TreeNode ( int val){
    this.val = val;
    this.left = left;
    this.right = right;
  }


}
public class postOrder {


  public static void postOrderTraversal ( TreeNode root){

    if ( root == null){
      return ;
    }

     postOrderTraversal(root.left);

     postOrderTraversal(root.right);

    System.out.print(root.val + " -->> ");
  }

  public static void main ( String args[]){

    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);
    root.right = new TreeNode ( 3);

    root.left.right  = new TreeNode ( 7);
    root.left.left= new TreeNode ( 9);

    postOrderTraversal(root);


  }
  
}
