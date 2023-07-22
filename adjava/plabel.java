import java.applet.*;
import java.awt.*;

//import javafx.scene.control.Label;
public class plabel extends Applet{
    
       Label l1;
       public void init()
       {
        l1=new Label("Hello There");
        add(l1);
       }
         
    
}
/*<applet code="plabel.class" width="300" height="300">
</applet>*/