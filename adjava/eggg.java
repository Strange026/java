import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//import javafx.scene.input.MouseEvent;


public class eggg extends Applet implements MouseListener
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
        setBackground(Color.RED);
    }
    public void mousePressed(MouseEvent e)
    {
        setBackground(Color.blue);
    }
    public void mouseReleased(MouseEvent e)
    {
        setBackground(Color.pink);
    }
   
    public void mouseExited(MouseEvent e)
    {
        setBackground(Color.GREEN);
    }

    
}
/*<applet code="eggg" width="500" height="500">
</applet>*/
