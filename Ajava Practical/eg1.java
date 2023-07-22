

//<applet code="eg1" height="500" width="500"> </applet>
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class eg1 extends Applet{
    public void init(){
        Frame f=new Frame("frame");
        f.setVisible(true);
        f.setBounds(100,100,250,250);
        add(f);
        f.setBackground(Color.red);
    }
}
// import java.awt.*;
// import javax.swing.*;
// import java.awt.event.*;

// public class eg1 {

// public static JTextField txt_name=new JTextField(“JARVIS”);
    
// public static JFrame f = new JFrame();

//     public static void main(String arg[]) {
//         f.setSize(400, 400);
//         f.setLayout(null);
//         f.setVisible(true);
//         txt_name.setBounds(100, 100, 100, 20);
//         f.add(txt_name);
//     }
// }
