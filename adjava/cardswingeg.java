import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class cardswingeg extends Applet {
    public void init(){
        Panel cpanel = new Panel();
        CardLayout cards = new CardLayout();
        cpanel.setLayout(cards);
        
        Panel p1=new Panel();
        p1.add("Hello",new Button("Heyy There"));
        cpanel.add(p1,"first");
        
        Panel p2 = new Panel();
        p2.add("Hello",new Button("How are You"));
        cpanel.add(p2,"second");
        
        cards.show(cpanel,"first");
        add(cpanel);

    }
}
/*<applet code="cardswingeg" width="500" height="500">
</applet>*/
