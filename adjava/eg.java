import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class eg extends Applet implements ActionListener
{
    Label l1,l2,l3,l4,l5;
    Button b1,b2,b3,b4;
    TextField tf1,tf2,tf3;
    TextArea ta1;


    public void init(){
        setLayout(null);
        l1 = new Label("Enter Number");
        add(l1);
        tf1= new TextField("");
        add(tf1);
        
        tf1.setBounds(230,100,110,30);
        l1.setBounds(100,100,110,30);


        l2 = new Label("Enter Number");
         add(l2);
        tf2 = new TextField("");
        add(tf2);
        tf2.setBounds(230,150,100,30);
        l2.setBounds(100,150,110,30);

        l3 = new Label("Answer");
        l3.setBounds(100,210,100,30);
        add(l3);
        tf3 = new TextField("");
        tf3.setBounds(230,210,100,30);
        add(tf3);
        
        

       
        b1 = new Button("ADD");
        add(b1);
        b1.setBounds(100,360,70,30);
        b1.addActionListener(this);

        b2 = new Button("SUB");
        add(b2);
        b2.setBounds(190,360,70,30);
        b2.addActionListener(this);
        
        b3 = new Button("MUL");
        add(b3);
        b3.setBounds(280,360,70,30);
        b3.addActionListener(this);

        b4 = new Button("DIV");
        add(b4);
        b4.setBounds(370,360,70,30);
        b4.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        int a,b;
        a=Integer.parseInt(tf1.getText());
        b=Integer.parseInt(tf1.getText());
        if(e.getSource()==b1)
        tf3.setText(""+(a+b));

        if(e.getSource()==b2)
        tf3.setText(""+(a-b));

        if(e.getSource()==b3)
        tf3.setText(""+(a*b));

        if(e.getSource()==b4)
        tf3.setText(""+(a/b));


    }

    
}
/*<applet code="eg.class" width="500" height="500">
</applet>*/
