//<Applet code=popup width=400 height=400></Applet>
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
 
public class popup extends Applet implements ActionListener
{
    PopupMenu p;

    public void init(){
        MenuItem mi;
        p=new PopupMenu("popup menu");
        p.add(mi=new MenuItem("new"));
        mi.addActionListener(this);
        p.add(mi=new MenuItem("close"));
        mi.addActionListener(this);
        p.add(mi=new MenuItem("open"));
        mi.addActionListener(this);
        add(p);
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println(e);
    }
    public void processMouseEvent(MouseEvent m){
        if(m.isPopupTrigger()){
            p.show(m.getComponent(),m.getX(),m.getY());
            super.processMouseEvent(m);
        }
    }
}