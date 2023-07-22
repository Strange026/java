import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//import javafx.scene.input.MouseEvent;


public class appi extends Applet implements MouseMotionListener
{
    
    public void init()
    {
        addMouseMotionListener(this);   
    }
    
    
    public void mouseMoved(MouseEvent e)
    {
        
        
    }
    public void mouseDragged(MouseEvent e)
    {
        //setBackground(Color.RED);
    }
   
}
/*<applet code="appi" width="500" height="500">
</applet>*/
