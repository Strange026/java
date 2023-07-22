
//<applet code="ex" width="500" height="800"></applet>
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class ex extends Applet implements ActionListener{
Button b; Frame f;
public void init(){
setLayout(null);
f=new Frame();
f.setSize(500,800);
f.setVisible(true);
b=new Button("click_me");
b.setBackground(Color.red);
b.setBounds(100,100,50,50);
f.add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
    if(e.getSource()==b) {
    if(b.getBackground()==Color.RED){
    b.setBackground(Color.green);
    }
    else if(b.getBackground()==Color.green){
    b.setBackground(Color.blue);
    }
    else{
    b.setBackground(Color.red);
    }
    }
    }
    public void paint(Graphics g)
    {}
    }
