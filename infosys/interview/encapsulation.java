public class encapsulation {

  static class employee{

    private int id;
    private String name;

    public int getId(){
      return id;
    }
    public void setId(int id){
      this.id= id;
    }
    public String getName(){
      return name;
    }

    public void setName(String name){
      this.name= name;
    }


  }

  public static void main (String args[]){
    encapsulation e = new encapsulation();
    employee emp = new employee();
    emp.setId(1);
    emp.setName("jay");
    System.out.print(emp.getId());
    System.out.print(emp.getName());
  }
  
}
