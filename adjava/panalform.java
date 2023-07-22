
import java.awt.*;

//import javafx.scene.control.Label;

public class panalform {
    public static void main(String[] args) {
        Frame f=new Frame();
        
        f.setSize(300,300);
        f.setVisible(true);
        
            f.setLayout(null);
           Label l1 = new Label("enter name");
            f.add(l1);
            TextField tf1= new TextField("name");
            f.add(tf1);
            
            tf1.setBounds(210,100,110,30);
            l1.setBounds(100,100,110,30);
    
    
            Label l2 = new Label("Enter Address");
            f.add(l2);
            TextArea ta1 = new TextArea("address");
            f.add(ta1);
            ta1.setBounds(230,150,110,50);
            l2.setBounds(100,150,110,30);

           Label l4 = new Label("enter choice");
        f.add(l4);
        l4.setBounds(100,270,110,30);
        Choice c1 = new Choice();
        f.add(c1);
        c1.addItem("Applea");
        c1.addItem("samsung");
        c1.addItem("oneplus");
        c1.setBounds(220,270,110,30);

        Label l5 = new Label("view");
        f.add(l5);
       List lst1 = new List();
        f.add(lst1);
        lst1.addItem("ca");
        
        lst1.addItem("mba");
        
        lst1.addItem("mbbs");
        lst1.setBounds(220,300,110,30);
        l5.setBounds(100,300,110,30);

        Button b1 = new Button("submit");
        f.add(b1);
        b1.setBounds(130,360,95,30);

        Label l3 = new Label("enter your gender");
        f.add(l3);
        l3.setBounds(100,220,110,30);
        CheckboxGroup cb = new CheckboxGroup ();
       Checkbox chk2 = new Checkbox("female",cb,false); 
        f.add(chk2);
        chk2.setBounds(350,210,110,50);

        //CheckboxGroup cb = new CheckboxGroup ();
        Checkbox chk1 = new Checkbox("male",cb,false); 
        f.add(chk1);
        chk1.setBounds(230,210,110,50);

        Panel p = new Panel();
        f.add(p);
        p.setBackground(Color.RED);
        
    }

 }
