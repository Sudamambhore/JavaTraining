package first;
import java.sql.*;
public class insert {
    public String getGreeting() throws Exception {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        // System.out.println(new App().getGreeting());
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "sudam");

        System.out.println("Coonection done");

        Statement stmt;
        stmt = conn.createStatement();
        String sql;
        sql = "insert into student values(2200,'Shivam')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }
}

    

