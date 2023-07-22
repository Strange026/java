import java.sql.*;
public class dbconnection{
    public static void main(String args[])
    {
        Connection cn=null;
        Statement st=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
            st=cn.createStatement();
            st.executeUpdate("create database emp");
        }catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}