import java.sql.*;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Scanner sc=new Scanner(System.in);
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "sudam");
        System.out.println("Coonection done");
        Statement stmt;
        stmt=conn.createStatement();

        System.out.println("Enter 1 For insert 2 for Select 3 for update 4 for Delete 5 for Exit");
        int choice;
        System.out.println("Enter Your Choice");
        choice=sc.nextInt();
        System.out.println("Enter Id"); 
        int id=sc.nextInt();  
        System.out.println("Enter Name"); 
        String name=sc.next();
        String sql;
        if(choice==1){
                 sql="insert into student values("+id+",'"+name+"')";
                 stmt.executeUpdate(sql);
        }else if(choice==2){
                 sql="delete into student where id="+id+"";
                 stmt.executeUpdate(sql);
        }else if(choice==3){
                 sql="update student set id="+id+" where name="+name+"";
                 stmt.executeUpdate(sql);
        }else if(choice==4){
                 sql="select * from student";
          }else{
                 System.out.println("Number is Out Of Bound");
                 
          }
            
               //String sql;
        //sql="insert into student values("+id+",'"+name+"')";
        // stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }
}
