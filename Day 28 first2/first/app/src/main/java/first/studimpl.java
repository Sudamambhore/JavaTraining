package first;

import java.sql.*;

public class studimpl implements studInterface {
    @Override
    public void save(student st) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(student st) {
        // TODO Auto-generated method stub
        String sql = "";
        String name = st.getName();
        int id = st.getId();
        sql = "update student set name='" + name + "' where id=" + id;
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "sudam");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Updated");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void delete(student st) {
        // TODO Auto-generated method stub
        String sql = "";
        // String name = st.getName();
        int id = st.getId();
        sql = "delete from student where id=" + id;
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "sudam");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Deleted");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void insert(student st) {
        // TODO Auto-generated method stub
        String sql = "";
        String name = st.getName();
        int id = st.getId();
        sql = "insert into student values(" + id + ",'" + name + "')";
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "sudam");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record inserted");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public student getStud(int id) {
        // TODO Auto-generated method stub
        return null;
    }

}
