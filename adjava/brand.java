import java.applet.*;
import java.awt.*;

//import javafx.scene.paint.Color;
public class brand extends Applet{
    public void paint(Graphics g){

        Color c = new Color(255,158,6);
        Color h = new Color(55,125,44);
        Color b = new Color(0,0,0);
        Color r = new Color(128,64,64);

        
      
       //base
       g.setColor(r);
         g.fillRoundRect(600, 600, 150, 10, 10,10);
         g.fillRoundRect(612, 593, 125, 7, 8,8);
         g.fillRoundRect(624, 588, 100, 5, 6,6);

        //line
        g.setColor(b);
        g.drawLine(670,588,670,200); 
         //flag
         g.setColor(c);

         g.fillRoundRect(670,200, 160, 30, 10,10);
         g.setColor(b);
         g.drawRoundRect(670,230, 160, 30, 10,10);

         g.setColor(h);
         g.fillRoundRect(670,260, 160, 30, 10,10);
         //circle
         g.drawOval(735, 233, 25, 25);


    }
}
/*<applet code="brand.class" width="500" height="500">
</applet>*/