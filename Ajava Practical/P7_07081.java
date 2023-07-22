import java.awt.*;
import java.awt.event.*;

public class P7_07081 implements ActionListener {
    Frame f;
    Button b;

    P7_07081() {
        f = new Frame("P7_07081.java");
        b = new Button("Click");
        f.setLayout(null);
        b.addActionListener(this);
        f.add(b);
        b.setBounds(215, 100, 60, 40);
        f.setVisible(true);
        f.setSize(500, 300);
    }

    public static void main(String args[]) {
        P7_07081 f = new P7_07081();
    }

    public void actionPerformed(ActionEvent e) {
        if (f.getBackground() == Color.red) 
        {
            f.setBackground(Color.green);
        }
         else if (f.getBackground() == Color.green)
          {
            f.setBackground(Color.blue);
          }
         else {
            f.setBackground(Color.red);
        }
    }
}