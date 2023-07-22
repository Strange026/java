
//<applet code="P4_07081" width="500" height="500"></applet>
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class P4_07081 extends Applet implements MouseMotionListener
{
    Label l1,l2;
    int x,y;

    public void init()
    {
        setLayout(null);
        l1=new Label("Moved X: "+x);
        add(l1);
        l1.setBounds(0,0,120,20);

        l2=new Label("Moved Y: "+y);
        add(l2);
        l2.setBounds(117,0,120,20);

        addMouseMotionListener(this);
    }
    public void mouseMoved(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        l1.setText("Moved X: "+x);
        l2.setText("Moved Y: "+y);
        repaint();
    }
    public void mouseDragged(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        l1.setText("Dragged X: "+x);
        l2.setText("Dragged Y: "+y);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(x,y,10,10);
    }

}