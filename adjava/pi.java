import java.applet.*;
import java.awt.*;
public class pi extends Applet{
    public void paint(Graphics g){
        
        g.drawLine(150,0,0,150);
         g.drawLine(300,150,150,300);
         g.drawLine(0,150,150,300);
         g.drawLine(300,150,150,0);
    }
}
/*<applet code="pi.class" width="300" height="300">
</applet>*/