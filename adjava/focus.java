import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//import javafx.scene.control.CheckBox;


public class focus extends Applet implements FocusListener
{
    Label l1,l2,l3;
    Button b1;
    TextField tf1,tf2;
    TextArea ta1;
    Checkbox ch1;


    public void init(){
        setLayout(null);
        l1 = new Label("Enter String");
        add(l1);
        tf1= new TextField("");
        add(tf1);
        
        tf1.setBounds(230,100,110,30);
        l1.setBounds(100,100,110,30);


        l2 = new Label("Answer");
         add(l2);
        tf2 = new TextField("");
        add(tf2);
        tf2.setBounds(230,150,100,30);
        l2.setBounds(100,150,110,30);
        tf1.addFocusListener(this);
        
        
        

       
        // b1 = new Button("Submit");
        // add(b1);
        // b1.setBounds(100,360,70,30);
        // b1.addActionListener(this);

        

    }
    public void focusLost(FocusEvent e){
       // char b;
       StringBuffer s= new StringBuffer(tf1.getText());
       s.reverse();
       tf2.setText(""+s);
       
      // b=tf2.getText(""+b);

    }
    public void focusGained(FocusEvent e){
        
    }

    
}
/*<applet code="focus" width="700" height="700">
</applet>*/
