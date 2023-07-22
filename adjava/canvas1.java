/*<applet code="canvas1.class" width="500" height="500">
</applet>*/
import java.applet.*;
import java.awt.*;

//import javafx.scene.paint.Color;

//import javafx.scene.canvas.Canvas;

public class canvas1 extends Applet{

        Canvas c;
        public void init()
        {
            c= new Canvas();
            c.setSize(100,100);
            add(c);
            c.setBackground(Color.RED);
        }
}