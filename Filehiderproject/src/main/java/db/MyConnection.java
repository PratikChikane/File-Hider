package db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class MyConnection {
     public static Connection connection;
     public static Connection getConnection(){
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ytproject?useSSL=false","root", "root@123");

         } catch (ClassNotFoundException | SQLException e) {
             throw new RuntimeException(e);
         }
         System.out.println("connection established succesfully");
         return connection;
     }
     public static void closeConnection(){
         if(connection != null){
try {
    connection.close();
}catch(SQLException ex){
    ex.printStackTrace();
}
         }
     }


}
