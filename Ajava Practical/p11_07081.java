import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class p11_07081 extends Frame implements ActionListener {
    Label l1, l2, l3, l4, l5, l6;
    TextField t1, t2, t3, t4;
    Button b1, b2, b3;
    Choice s1;
    Connection cn = null;

    private void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");

            Statement st = cn.createStatement();
            st.execute("USE practical");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    p11_07081() {
        setLayout(null);
        setVisible(true);
        setSize(500, 500);
        setTitle("P11_07012.java");
        l1 = new Label("Enter Name");
        add(l1);
        l1.setBounds(100, 100, 80, 30);

        t1 = new TextField();
        add(t1);
        t1.setBounds(200, 100, 100, 30);

        l2 = new Label("Number");
        add(l2);
        l2.setBounds(100, 150, 80, 30);

        t2 = new TextField();
        add(t2);
        t2.setBounds(200, 150, 100, 30);

        l3 = new Label("Email");
        add(l3);
        l3.setBounds(100, 200, 80, 30);

        t3 = new TextField();
        add(t3);
        t3.setBounds(200, 200, 100, 30);

        l4 = new Label("Enrollment No");
        add(l4);
        l4.setBounds(100, 250, 80, 30);

        t4 = new TextField();
        add(t4);
        t4.setBounds(200, 250, 100, 30);

        l5 = new Label("Branch");
        add(l5);
        l5.setBounds(100, 300, 80, 30);

        b1 = new Button("Submit");
        b1.setBounds(70, 350, 80, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new Button("Delete");
        b2.setBounds(170, 350, 80, 30);
        b2.addActionListener(this);
        add(b2);

        b3 = new Button("Update");
        b3.setBounds(270, 350, 80, 30);
        b3.addActionListener(this);
        add(b3);

        s1 = new Choice();
        s1.addItem("CE");
        s1.addItem("IT");
        s1.addItem("Automobile");
        add(s1);
        s1.setBounds(200, 300, 100, 100);

        l6 = new Label("");
        add(l6);
        l6.setBounds(150, 450, 200, 30);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            connect();

            String name = t1.getText();
            String number = t2.getText();
            String email = t3.getText();
            String enrollment = t4.getText();
            String branch = s1.getSelectedItem().toString();

            if (e.getSource() == b1) {
                // validate if all feilds has atlease 1 char
                if (name.length() == 0 || number.length() == 0 || email.length() == 0
                        || enrollment.length() == 0 || branch.length() == 0)
                 {
                    l6.setText("Please fill all feilds");
                } else {
                    Statement st = cn.createStatement();
                    st.executeUpdate("insert into student(name, number, email, enrollmentNo, branch) values('" + name
                            + "','" + number + "','" + email + "','"
                            + enrollment + "','" + branch + "')");

                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");

                    l6.setText("Record Inserted Successfully");
                }
            } else if (e.getSource() == b2) {
                // delete record
                if (enrollment.length() == 0) {
                    l6.setText("Please enter enrollment no");
                } else {
                    Statement st = cn.createStatement();
                    st.executeUpdate("delete from student where enrollmentNo='" + enrollment + "'");

                    l6.setText("record deleted");
                }
            } else if (e.getSource() == b3) {
                // update record
                if (enrollment.length() == 0) {
                    l6.setText("Please enter enrollment no");
                } else {
                    Statement st = cn.createStatement();
                    st.executeUpdate("update student set name='" + name + "', number='" + number + "', email='"
                            + email + "', branch='" + branch
                            + "' where enrollmentNo='" + enrollment + "'");

                    l6.setText("record updated");
                }
            }

        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new p11_07081();
    }
}