// <applet code =npad height =500 width=500> </applet>  
import java.applet.*;
import java.awt.*;
public class npad extends Applet
{
  Frame f;
  Menu m;
 public void init()
 {
     f=new Frame();
      f.setSize(300,300);
      f.setVisible(true);
    MenuBar m= new MenuBar();
     Menu m1= new Menu("File");
     MenuItem mi = new MenuItem("New");
     m1.add(mi);
     m.add(m1);
     MenuItem mi1 = new MenuItem("Open");
     m1.add(mi1);
     m.add(m1);
     MenuItem mi2 = new MenuItem("Save");
     m1.add(mi2);
     m.add(m1);
     MenuItem mi3 = new MenuItem("Save As");
     m1.add(mi3);
     m.add(m1);
     f.setMenuBar(m);  
 
    
     Menu m2= new Menu("Edit");
     MenuItem mni = new MenuItem("Cut");
     m2.add(mni);
     m.add(m2);
     MenuItem mni1 = new MenuItem("Copy");
     m2.add(mni1);
     
     MenuItem mni2 = new MenuItem("Cut");
     
     m2.add(mni2);
     MenuItem mni3 = new MenuItem("Delete");
     m2.add(mni3);
     
     MenuItem mni4 = new MenuItem("Rename");
     m2.add(mni4);
     

      
     f.setMenuBar(m); 
 } 
}