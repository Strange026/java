/*
<applet code="prac10" width="700" height="700">
</applet>
 */
import java.applet.*;
import java.awt.*;
public class prac10 extends Applet implements Runnable
{
   int x=0,r1,g1,b1,h1=200,x1=200,y1=200,r2=255,b2=255,g2=255;
    Thread t;
    public void start()
    {
        Thread t=new Thread (this);
        t.start();
    }
    public void run()
    {
        for(h1=200;h1>=50;h1--)
        {
            try{
                repaint();
                Thread.sleep(100);
                if( h1>=0 && h1<=200)
                {
                 r1=255;
                 g1=255;
                 b1=255;
                 
                if(r2==255 && b2==255 && g2==255)
                {
                    r2=0;
                    b2=0;
                    g2=0;
                }
                else{
                    b2=255;
                    g2=255;
                    r2=255;
                }
                }
                
            }
            catch(InterruptedException e)
            {
            }
        }
    }
    public void paint(Graphics g)
    {
    
        Color c = new Color(r1,g1,b1);
        g.setColor(c);
        setBackground(Color.black);
        g.fillRect(101,171,h1,h1);
        //g.fillRect(350,171,100,100);

       
        Color c1 = new Color(r2,g2,b2);
        g.setColor(c1);
        
        //g.fillRect(101,171,h1,h1);
        g.fillRect(350,171,100,100);
    }
}