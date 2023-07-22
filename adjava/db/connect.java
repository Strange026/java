import java.sql.*;

public class connect
    {
        public static void main(String arg[])
        {
            Connection cn=null;
            Statement st=null; 


            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost/emp","root","");
                st=cn.createStatement();
                 //st.executeUpdate("create table test (t_name varchar(20),t_no varchar(20))"); //create
                 // st.executeUpdate("insert into test values('ved',081)"); //insert
                 //st.executeUpdate("delete from test where t_no = 10"); //update
                // st.executeUpdate("update  test set t_no=7081 where t_no=81"); //delete
                System.out.println("successfully");
               ResultSet rs=st.executeQuery("select * from test");//select
                while(rs.next())
                 {
                     System.out.println(rs.getString(1) +" "+rs.getString(2));
                }
            }
            catch(SQLException e)
            {
                System.out.println("Error");
                e.printStackTrace();
            }
            catch(Exception e)
            {
                System.out.println("Error1");
                e.printStackTrace();
            }
        }
    }