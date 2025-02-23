import java.sql.*;
class TestDB{
 public static void main(String[] args){
 try { 
  Class.forName("com.mysql.jdbc.Driver");
  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","");
 //database="", username=root and password=""
 
 System.out.println("Database connected");
  Statement st=conn.createStatement();
 
 //clearing data
  String sql="DELETE FROM student";
  st.execute(sql);
 
//inserting data
  String sql1="INSERT INTO student(sid,name,address,contact) VALUES ('1','Raaju','Btm','9862612723'), ('2','Ram','Ktm','8811111111');";
  st.execute(sql1);
  System.out.println("Data Inserted Successfully");
 
 //retrieving data 
  System.out.println("Data Before Update and Delete");
  String sql4="SELECT * FROM student;";
  ResultSet rs=st.executeQuery(sql4);
 
 System.out.println("Sid\t"+"Name\t"+"address\t"+"Contact");
  while(rs.next()) {
  String sid=rs.getString(1);
  String name=rs.getString(2);
  String address=rs.getString(3);
  String contact=rs.getString(4);
 
 System.out.println(sid+"\t"+name+"\t"+address+"\t"+contact);
  }
 
 //updating data
  String sql2="UPDATE student SET name='Hari',address='Ktm' WHERE sid='1';";
  st.execute(sql2);
  System.out.println("\nData Updated Successfully");
 
 

//deleting data
  String sql3="DELETE FROM student WHERE sid='2';";
  st.execute(sql3);
  System.out.println("Data Deleted Successfully\n");
 
 //retrieving data
  System.out.println("Data After Update and Delete");
  String sql5="SELECT * FROM student;";
  ResultSet rs1=st.executeQuery(sql5);
 
 System.out.println("Sid\t"+"Name\t"+"address\t"+"Contact");
  while(rs1.next()) {
  String sid=rs1.getString(1);
  String name=rs1.getString(2);
  String address=rs1.getString(3);
  String contact=rs1.getString(4);
 
 System.out.println(sid+"\t"+name+"\t"+address+"\t"+contact);
  }
 
 }catch(Exception e) {
 System.out.println(e);
 }
 }
}