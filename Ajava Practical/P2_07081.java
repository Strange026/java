import java.applet.*;
import java.awt.*;

public class P2_07081 extends Applet {
    public void paint(Graphics g) {
        for (int i = 0; i < 10; i++) {
            g.setColor(Color.red);
            g.fillOval(220, i * 50, 50, 50);
        }
    }
}
/*<applet code="P2_07081" width="500" height="500">
</applet>*/ 