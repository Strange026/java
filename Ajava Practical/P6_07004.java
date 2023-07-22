import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class P6_07004 extends Applet implements MouseListener
{
    public void init()
    {
        addMouseListener(this);   
    }
    
    public void mouseClicked(MouseEvent e)
    {
        setBackground(Color.cyan);
    }
    public void mouseEntered(MouseEvent e)
    {
         setBackground(Color.green);
    }
    public void mousePressed(MouseEvent e)
    {
        setBackground(Color.pink);
    }
    public void mouseReleased(MouseEvent e)
    {
        setBackground(Color.blue);
    }
   
    public void mouseExited(MouseEvent e)
    {
        setBackground(Color.red);
    }

    
}
/*<applet code="P6_07004" width="300" height="300">
</applet>*/
