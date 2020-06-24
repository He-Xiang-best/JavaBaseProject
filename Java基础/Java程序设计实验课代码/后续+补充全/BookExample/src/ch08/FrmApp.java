package ch08;
import java.awt.*;
import javax.swing.*;
public class FrmApp {

	  static JFrame fra=new JFrame("¿ò¼ÜÊ¾Àý"); 
	  public static void main(String args[])
	  {
	    fra.setSize(250,150);
	    fra.setLocation(100,200);  
	    fra.setVisible(true);
	    System.out.println("State:"+fra.getState());
	    System.out.println("Title:"+fra.getTitle());
	    System.out.println("Visible:"+fra.isVisible());
	    fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
}
