import java.applet.*;
import java.awt.*;

//import javafx.scene.paint.Color;
public class ball extends Applet implements Runnable
{
    
    int x=100;
    int y=100;
    int temp=0;
    Thread t;

    public void start()
    {
        t=new Thread (this);
        t.start();
    }
    public void run()
    {

        for(;;)
        {
            try{
                repaint();
                Thread.sleep(8);
                if(temp==0)
                {
                    x++;
                    if(x>=450 && x<=470 ){

                        temp=1;

                    }
                    


                }
                
                if(temp==1)
                {
                    x--;
                    if(x>=90 && x<=110 ){

                        temp=0;

                    }
                    


                }
            }

            catch(InterruptedException e){}

        }
        
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawOval(x,y,50,50);
       


    }
}
/*<applet code="ball.class" width="500" height="500">
</applet>*/