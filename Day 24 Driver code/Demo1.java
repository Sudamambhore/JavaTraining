 // Load database driver in memory

import java.sql.*;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) throws Exception {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id");
        int id=sc.nextInt();
   
        System.out.println("Enter Name");
        String name=sc.next();
       
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "sudam");

        System.out.println("Coonection done");

        Statement stmt;
        stmt=conn.createStatement();
        String sql;
        sql="insert into student values("+id+",'"+name+"')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }
}