
class Database{

 public  static class DatabaseSingleTon{

  private static DatabaseSingleTon instance;

  

    private DatabaseSingleTon(){
      System.out.println(" database object created : ");
    }

    private static DatabaseSingleTon getInstance(){

      if ( instance == null){
        instance = new DatabaseSingleTon();
      }

      return instance;
    }

    public void databaseConnect(){
      System.out.println(" database connected ");
    }
  }

  public static void main(String[] args) {

    DatabaseSingleTon db1 = DatabaseSingleTon.getInstance();
    DatabaseSingleTon db2 = DatabaseSingleTon.getInstance();
    DatabaseSingleTon db3 = DatabaseSingleTon.getInstance();

    System.out.println(db1 == db2);
    System.out.println(db2 == db3);

  }


}