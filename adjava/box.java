import java.applet.*;
import java.awt.*;
public class box extends Applet{
    public void paint(Graphics g){
        //box
         g.drawLine(100,100,200,100);
         g.drawLine(100,100,100,200);
         g.drawLine(200,100,200,200);
         g.drawLine(100,200,200,200);
         //cross
         g.drawLine(100,100,200,200);
         g.drawLine(200,100,100,200);
         //triangle
         g.drawLine(100,100,150,50);
         g.drawLine(200,100,150,50);
         //line
         g.drawLine(150,50,150,5);
         //flag
         g.drawLine(150,5,200,20);
         g.drawLine(200,20,150,25);
        //  g.drawOval(200,200,50,50);
    }
}
/*<applet code="box.class" width="300" height="300">
</applet>*/