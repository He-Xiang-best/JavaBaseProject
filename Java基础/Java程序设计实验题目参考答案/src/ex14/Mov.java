package ex14;

import java.awt.*;

import javax.swing.JFrame;

import ex13.selected.MenuTest;

public class Mov extends JFrame{
	int x1=50,x2=25,y1=50,y2=10;
	public Mov(String name){
		super(name);
	}
	public void paint(Graphics g){
		int w=this.getWidth();
		int h=this.getHeight();
		if(x1>=w){
			x1=50;
		}
		if(x2>h){
			x2=5;
		}
		g.setColor(Color.orange);
		g.fillOval(x1, y1, x2, x2);
		g.drawOval(x1, y1, x2, x2);
		x1+=50;
		x2+=5;
		try{
			Thread.sleep(500);
		}
		catch(Exception e){}
		g.clearRect(0,0, getWidth(), getHeight());
		repaint();
	}
	
	public static void main(String args[]){
		JFrame a = new Mov("Ô²ÐÎ¶¯»­Àý³Ì");
		a.setSize(500,500);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setVisible(true);
	}
}

