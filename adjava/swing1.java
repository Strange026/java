import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class swing1 extends JApplet{
    public void paint(Graphics g){
        //box
         g.drawLine(100,100,200,100);
         g.drawLine(100,100,100,200);
         g.drawLine(200,100,200,200);
         g.drawLine(100,200,200,200);
        
    }
}
/*<applet code="swing1" width="300" height="300">
</applet>*/