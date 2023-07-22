import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class gui extends Applet implements ActionListener
{
    Label l1,l2,l3,l4,l5;
    Button b1,b2,b3,b4;
    TextField tf1,tf2,tf3;
    TextArea ta1;
    Connection cn=null;
        
        PreparedStatement st;



    public void init(){
        setLayout(null);
        l1 = new Label("Enter No");
        add(l1);
        tf1= new TextField("");
        add(tf1);
        
        tf1.setBounds(230,100,110,30);
        l1.setBounds(100,100,110,30);


        l2 = new Label("Enter Name");
         add(l2);
        tf2 = new TextField("");
        add(tf2);
        tf2.setBounds(230,150,100,30);
        l2.setBounds(100,150,110,30);

        // l3 = new Label("Answer");
        // l3.setBounds(100,210,100,30);
        // add(l3);
        // tf3 = new TextField("");
        // tf3.setBounds(230,210,100,30);
        // add(tf3);
        
        

       
        b1 = new Button("Create");
        add(b1);
        b1.setBounds(100,360,70,30);
        b1.addActionListener(this);

        b2 = new Button("Insert");
        add(b2);
        b2.setBounds(190,360,70,30);
        b2.addActionListener(this);
        
        b3 = new Button("Update");
        add(b3);
        b3.setBounds(280,360,70,30);
        b3.addActionListener(this);

        b4 = new Button("Delete");
        add(b4);
        b4.setBounds(370,360,70,30);
        b4.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
    
        

        // if(e.getSource()==b2)
        // tf3.setText(""+(a-b));

        // if(e.getSource()==b3)
        // tf3.setText(""+(a*b));

        // if(e.getSource()==b4)
        // tf3.setText(""+(a/b));
    
        
        if(e.getSource()==b1)
        {

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/emp","root","");
            st=cn.prepareStatement("insert into test values(?,?)");
             //st.executeUpdate("create table test (t_name varchar(20),t_no varchar(20))"); //create
             st.setString(1, tf1.getText());
             st.setString(2, tf2.getText());
             
             st.executeUpdate(); //insert
             //st.executeUpdate("delete from test where t_no = 10"); //update
            // st.executeUpdate("update  test set t_no=7081 where t_no=81"); //delete
            System.out.println("successfully");
        //    ResultSet rs=st.executeQuery("select * from test");//select
            // while(rs.next())
            //  {
            //      System.out.println(rs.getString(1) +" "+rs.getString(2));
            // }
        }
        catch(SQLException e2)
        {
            System.out.println("Error");
            e2.printStackTrace();
        }
        catch(Exception e1)
        {
            System.out.println("Error1");
            e1.printStackTrace();
        }
    }

    
}}
/*<applet code="gui.class" width="500" height="500">
</applet>*/
