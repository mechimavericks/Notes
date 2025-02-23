//import java.sql.*;
class Test{
    public static void main(String[] args){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Success");
       }catch (Exception e){
           System.out.println(e);
       }
    }
}