import java.applet.*;
import java.awt.*;


public class P3_07081 extends Applet 
{
    int x=10 , c=5;
    
    public void paint(Graphics g)
    {
        g.drawRect(100,200,500,100);
        for(int i=1;i<=50;i++)
        {
            try     {
                        Thread.sleep(100);
                    }
                        catch(InterruptedException e)
                        {
                            Thread.currentThread().interrupt();
                        }
                        Color c1=new Color(130+c,5+c,255-c);
                        g.setColor(c1);
                        g.fillRect(100, 200, x, 100);
                        x=x+10;
                        c=c+2;
            }
        }
    }

/*<applet code="P3_07081" width="700" height="500">
</applet>*/