import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//import javafx.scene.input.MouseEvent;


public class rgb extends Applet implements MouseListener
{
    
    public void init()
    {
        addMouseListener(this);   
    }
    
    
    public void mouseClicked(MouseEvent e)
    {
        
        if(getBackground()==Color.red)
        {
            setBackground(Color.GREEN);
        }
        else if(getBackground()==Color.green)
        {
            setBackground(Color.blue);
        }
        else
        {
            setBackground(Color.red);
        }
    }
    public void mouseEntered(MouseEvent e)
    {
        //setBackground(Color.RED);
    }
    public void mousePressed(MouseEvent e)
    {
        //setBackground(Color.blue);
    }
    public void mouseReleased(MouseEvent e)
    {
        //setBackground(Color.pink);
    }
   
    public void mouseExited(MouseEvent e)
    {
        //setBackground(Color.GREEN);
    }

    
}
/*<applet code="rgb" width="500" height="500">
</applet>*/
