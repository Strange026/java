
//<applet code="eg" width="500" height="500"></applet>
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class eg extends Applet implements MouseMotionListener {

    int mouseX = 0, mouseY = 0;
    String str;

    public void init() {
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        str = "Mouse Moved";
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        str = "Mouse dragged";
        repaint();
    }

    public void paint(Graphics g) {
        showStatus(str + " at " + mouseX + "," + mouseY);
    }
}