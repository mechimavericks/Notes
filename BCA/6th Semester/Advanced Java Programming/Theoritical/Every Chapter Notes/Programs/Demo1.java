/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Adv_java;

/**
 *
 * @author Administrator
 */
import java.sql.*;

public class Demo1 {
    public static void main(String[] args) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String DB_URL = "jdbc:sqlserver://RAHULAGRAWAL:1433;databaseName=BCA;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
            Connection con = DriverManager.getConnection(DB_URL);
            System.out.println("Database connected...");
            Statement statement = con.createStatement();
            String sql = "CREATE TABLE PRODUCT (ID VARCHAR(10),NAME VARCHAR(30),PRICE FLOAT,PRIMARY KEY(ID));";
            statement.executeUpdate(sql);
        }

        catch (Exception e) {
            e.printStackTrace();

        }
    }

}
