//<applet code="p9_07081.class" width=500 height=500></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class p9_07081 extends Applet implements ActionListener {
    MenuBar mb;
    TextArea ta;
    Frame f;
    Panel p;

    public void init() {
        setLayout(null);
        f = new Frame("P9_07081");
        f.setSize(500, 500);
        p = new Panel();
        f.add(p);
        ta = new TextArea(3, 35);
        p.add(ta);
        f.setBackground(Color.gray);
        f.setVisible(true);
        mb = new MenuBar();
        f.setMenuBar(mb);

        Menu fm = new Menu("File");
        mb.add(fm);


        Menu em = new Menu("Edit");
        mb.add(em);


        MenuItem mi = new MenuItem("New");
        mi.addActionListener(this);
        fm.add(mi);

        mi = new MenuItem("Open");
        mi.addActionListener(this);
        fm.add(mi);

        mi = new MenuItem("Save");
        mi.addActionListener(this);
        fm.add(mi);

        mi = new MenuItem("Save As");
        mi.addActionListener(this);
        fm.add(mi);


        MenuItem ei=new MenuItem("Cut");
        ei.addActionListener(this);
        em.add(ei);

        ei=new MenuItem("Copy");
        ei.addActionListener(this);
        em.add(ei);
        
   
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof MenuItem) 
        {
            ta.setText("You have selected " + e.getActionCommand());
        }
    }
}