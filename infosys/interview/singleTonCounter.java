public class singleTonCounter {

  static class counter{

    private static counter instance;

    int count =0;

    private  counter (){
    }

    private static counter getInstance(){
      if (instance== null){
        instance = new counter();
      }
      return instance;
    }

    void increment (){
      count++;
    }
  }

  public static void main(String[] args) {

   counter c1 = counter.getInstance();
   counter c2 = counter.getInstance();
  //  counter c3= counter.getInstance();

   c1.increment();
   c1.increment();
   c2.increment();

   System.out.println(c1.count);
   
   System.out.println(c2.count);
   

    
  }
  
}
