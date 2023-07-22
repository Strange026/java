import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;
public class rgbcheck extends Applet implements ItemListener
{
    Checkbox ch1,ch2,ch3;
    Canvas c;
    public void init()
    {
        ch1 = new Checkbox("Red");
        add(ch1);
        ch2 = new Checkbox("Green");
        add(ch2);
        ch3 = new Checkbox("Blue");
        add(ch3);
        ch1.addItemListener(this);
        ch2.addItemListener(this);
        ch3.addItemListener(this);
        c= new Canvas();
        c.setSize(30,30);
        c.setVisible(true);
        add(c);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(ch1.getState())
        {
            Color c1 = new Color(255,0,0);
            c.setBackground(c1);
        }
        else if(ch2.getState())
        {
            Color c2 = new Color(0,255,0);
            c.setBackground(c2);
        }
        else if(ch3.getState())
        {
            Color c3 = new Color(0,0,255);
            c.setBackground(c3);
        }
        if(ch1.getState() && ch2.getState())
        {
            Color c4 = new Color(255,255,0);
            c.setBackground(c4);
        }
        if(ch1.getState() && ch3.getState())
        {
            Color c5 = new Color(255,0,255);
            c.setBackground(c5);
        }
        if(ch2.getState() && ch3.getState())
        {
            Color c6 = new Color(0,255,255);
            c.setBackground(c6);
        }
        if(ch2.getState() && ch3.getState() && ch1.getState())
        {
            Color c7 = new Color(255,255,255);
            c.setBackground(c7);
        }
        if(!ch2.getState() && !ch3.getState() && !ch1.getState())
        {
            Color c8 = new Color(0,0,0);
            c.setBackground(c8);
        }
    }
}


/* 
<applet code="rgbcheck" width="600" height="600"> 
</applet> 
*/