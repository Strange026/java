import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class p12_07081 extends Frame implements ItemListener {
    Connection cn;
    Label l1, l2, l3;
    Choice s1;

    p12_07081() {
        try {
            connect();
            setLayout(null);
            setVisible(true);
            setSize(500, 500);
            setTitle("P12_07081.java");


            l1 = new Label("Select Product");
            add(l1);
            l1.setBounds(100, 100, 80, 30);

            s1 = new Choice();

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT name FROM product");

            if (rs != null)
                while (rs.next()) {
                    s1.add(rs.getString(1));
                }

            add(s1);
            s1.setBounds(200, 100, 100, 30);
            s1.addItemListener(this);

            l2 = new Label("Price");
            add(l2);
            l2.setBounds(100, 150, 80, 30);

            l3 = new Label();
            add(l3);
            l3.setBounds(200, 150, 100, 30);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void getPrice(String name) {
        try {
            Statement st = cn.createStatement();
            // System.out.println("SELECT price FROM products WHERE name = '" + name + "'
            // limit 1");
            ResultSet rs = st.executeQuery("SELECT price FROM product WHERE name = '" + name + "' limit 1");

            if (rs != null)
                while (rs.next()) {
                    l3.setText(rs.getString(1));
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void itemStateChanged(ItemEvent e) {
        getPrice(s1.getSelectedItem().toString());
    }

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

    public static void main(String[] args) {
        new p12_07081();
    }

}