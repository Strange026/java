import java.applet.*;
import java.awt.*;

//import javafx.scene.paint.Color;
public class banner extends Applet implements Runnable
{
    String s= "Hello There";
    Thread t;

    public void start()
    {
        t=new Thread (this);
        t.start();
    }
    public void run()
    {
        char c;
        for(;;)
        {
            try{
                repaint();
                Thread.sleep(100);
                c=s.charAt(0);
                s=s.substring(1,s.length());
                s=s+c;

            }
            catch(InterruptedException e){}

        }
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawString(s,100,100);
       


    }
}
/*<applet code="banner.class" width="500" height="500">
</applet>*/