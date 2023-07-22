
import java.awt.*;

//import javafx.scene.control.Button;

//import javafx.scene.control.Label;

public class framex {
    public static void main(String[] args) {
    //     Frame f=new Frame("081");
    //     f.setSize(500,500);
    //     f.setVisible(true);

    //     BorderLayout f3= new BorderLayout();
    //     f.setLayout(f3);

    //    // FlowLayout f1 = new FlowLayout();
    //     //f.setLayout(f1);

    //     Button b1= new Button( "Button 1");
    //     f.add(b1,BorderLayout.EAST );
    //     Button b2= new Button( "Button 2");
    //     f.add(b2,BorderLayout.WEST);
    //     //f.add(new Button(b2,BorderLayout.WEST));


        Frame f=new Frame("081");
        f.setSize(500,500);
        f.setVisible(true);

       GridLayout f1 = new GridLayout(2,3);
        f.setLayout(f1);

        Button b1= new Button( "Button 1");
        f.add(b1,BorderLayout.EAST );
        Button b2= new Button( "Button 2");
        f.add(b2,BorderLayout.WEST);
    }
 }
