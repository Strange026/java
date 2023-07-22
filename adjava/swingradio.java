/*<applet code="swingradio" width=900 height=900></applet>*/
import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class swingradio extends JApplet
{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2;
    JTextArea ta1;
    JButton b1;
    JRadioButton r1,r2;
    JCheckBox ch1,ch2;
    ButtonGroup bg;
    public void init()
    {
    setLayout(null);         
    l1=new JLabel("Enter Name");
    add(l1);
    l1.setBounds(100, 100, 110, 30);
    t1=new JTextField("Name");
    add(t1);
    t1.setBounds(230, 100, 110, 30);

    l2=new JLabel("Your Address");
    add(l2);
    l2.setBounds(100, 150, 110, 30);
    ta1=new JTextArea("Adress");
    add(ta1);
    ta1.setBounds(230, 150, 110, 100);

    
    // l3=new JLabel("Enter your C-NO");
    // add(l3);
    // l3.setBounds(100, 350, 130, 100);
    // t2=new JTextField("C-No");
    // add(t2);
    // t2.setBounds(230, 380, 110, 30);

    b1=new JButton("Submit");
    add(b1);
    b1.setBounds(180, 650, 110, 30);

    l4=new JLabel("Gender");
    add(l4);
    l4.setBounds(100, 415, 130, 100);
    r1=new JRadioButton("Male");
    add(r1);
    r1.setBounds(240, 450, 80, 30);
    r2=new JRadioButton("Female");
    r2.setBounds(320, 450, 80, 30);
    add(r2);
    bg=new ButtonGroup();
    bg.add(r1);
    bg.add(r2);

    l5=new JLabel("Enter Your Gender");
    add(l5);
    l5.setBounds(100, 300, 110, 30);
    ch1=new JCheckBox("Male",false);
    ch2=new JCheckBox("Female",false);
    ch2.setBounds(350, 265, 110, 100);
    add(ch1);
     ch1.setBounds(230, 265, 110, 100);
     add(ch2);
    }
}
