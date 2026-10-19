package edu.neu.mgen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class DbApp {
    public static void main(String[] args) {
        try {
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "");
            conn.setAutoCommit(false);
            System.out.println("Connected!");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM students");
            if (rs.next()) {
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("age"));
            }
            stmt.executeUpdate("UPDATE students SET name = 'Star' WHERE id = 1");
            rs = stmt.executeQuery("SELECT * FROM students");
            if (rs.next()) {
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("age"));
            }
            conn.rollback();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Connection failed: "+e.getMessage());
        }
    }
}