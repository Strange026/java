//<Applet code=P5_07081 width=300 height=300></Applet> 

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class P5_07081 extends Applet implements ActionListener {
    Button b1;
    int a = 0;

    public void init() {
        setLayout(null);

        b1 = new Button("start");
        add(b1);
        b1.setBounds(100, 100, 50, 30);

        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (a == 0) 
        {
            b1.setLabel("end");
            a = 1;
        } else if (a == 1)
        {
            b1.setLabel("start");
            a = 0;
        }
    }
}