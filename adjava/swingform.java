import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class swingform extends JApplet 
{
    JLabel l1,l2,l3,l4,l5;
    JButton b1;
    JTextField tf1;
    JTextArea ta1;
    JCheckBox chk1,chk2;
    JComboBox cb1;
    //JList lst1;
    

    public void init(){
        setLayout(null);
        l1 = new JLabel("enter number");
        add(l1);
        tf1= new JTextField("");
        add(tf1);
        
        tf1.setBounds(210,100,110,30);
        l1.setBounds(100,100,110,30);


        l2 = new JLabel("Enter Number");
         add(l2);
        tf1 = new JTextField("num");
        add(tf1);
        tf1.setBounds(230,150,110,50);
        l2.setBounds(100,150,110,30);

        l3 = new JLabel("ans");
        l3.setBounds(230,210,110,30);
        add(l3);
        tf1 = new JTextField("num");
        add(tf1);
        tf1.setBounds(230,150,110,50);
        

        // l3 = new Label("enter your gender");
        // add(l3);
        // l3.setBounds(100,220,110,30);
        
        chk1 = new JCheckBox("male");
        add(chk1);
        chk1.setBounds(230,210,110,50);

        chk2 = new JCheckBox("female");
        add(chk2);
        chk2.setBounds(350,210,110,50);

        // cb = new CheckboxGroup ();
        // chk2 = new Checkbox("female",cb,false); 
        // add(chk2);
        // chk2.setBounds(350,210,110,50);

        // cb = new CheckboxGroup ();
        // chk1 = new Checkbox("male",cb,true); 
        // add(chk1);
        // chk1.setBounds(230,210,110,50);


        // l4 = new Label("enter choice");
        // add(l4);
        // l4.setBounds(100,270,110,30);
        // c1 = new Choice();
        // add(c1);
        // c1.addItem("Applea");
        // c1.addItem("samsung");
        // c1.addItem("oneplus");
        // c1.setBounds(220,270,110,30);

        // l5 = new Label("view");
        // add(l5);
        // lst1 = new JList();
        // add(lst1);
        // lst1.AddItem("ca");
        
        // lst1.addItem("mba");
        
        // lst1.addItem("mbbs");
        // lst1.setBounds(220,300,110,30);
        // l5.setBounds(100,300,110,30);

        b1 = new JButton("submit");
        add(b1);
        b1.setBounds(130,360,95,30);

    }

    
}
/*<applet code="swingform" width="500" height="500">
</applet>*/
