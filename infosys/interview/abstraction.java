public class abstraction {

  abstract class parent {

    abstract void  meth();

    void concretea(){
      System.out.print(" i am concrete method");
    }

  }

  class b extends parent{

    void meth(){

      System.out.print("this is abstract method");
      
    }

  }



  
}







