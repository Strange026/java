/*<applet code="mousehov" width="500" height="500">
</applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class mousehov extends Applet implements MouseMotionListener{
    int x,y;
    public void init(){
        addMouseMotionListener(this);
    }
    public void mouseMoved(MouseEvent e){
        x=e.getX();
        y=e.getY();
        repaint();
    }
    public void mouseDragged(MouseEvent e){

    }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(x,y,x,y);
    }
}
