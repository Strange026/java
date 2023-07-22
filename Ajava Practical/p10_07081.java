import java.sql.*;

public class p10_07081 {
    Connection cn = null;

    p10_07081() {
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
            createDb();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createDb() {
        try (Statement s = cn.createStatement()) {
            s.executeUpdate("create database practicall");
            System.out.println("Database Created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            new p10_07081();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
