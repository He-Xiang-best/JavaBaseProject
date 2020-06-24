package ch08;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

public class _10DrawPanel extends JPanel{
	//设置画图坐标变量
	protected int pre_x,pre_y,x,y;
	//设置画图面板
	JPanel jp=new JPanel();
  public _10DrawPanel()
	{   //将窗口内容面板设置为方位布局，添加画图面板
		this.setLayout(new BorderLayout());
		this.add(jp,BorderLayout.CENTER);
		//将该画图面板与鼠标事件监听器绑定在一起
		this.addMouseListener(new myMouseListener());
		//将该画图面板与鼠标移动监听器绑定在一起
		this.addMouseMotionListener(new myMouseMotionListener());
		//设置绘图空间
		this.setPreferredSize(new Dimension(300,300));	

}
	//建立鼠标事件监听器内部类，继承鼠标适配器类
	private class myMouseListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{//点击鼠标左键，设置画笔起始点坐标
			pre_x=e.getX();
			pre_y=e.getY();
		}
	}
	//建立鼠标移动事件监听器内部类，继承鼠标移动适配器类
	private class myMouseMotionListener extends MouseMotionAdapter //implements MouseMotionListener
	{
		public void mouseDragged(MouseEvent e)
		{   //设置画笔绘画直线的终点坐标
			 x=e.getX();
			 y=e.getY();
			//画一条线
			Graphics g=jp.getGraphics();
			g.drawLine(pre_x,pre_y,x,y);
			//将当前画笔的终点坐标设置为新的起始点坐标，进行连续绘画。
			pre_x=x;
			pre_y=y;	
		}	
	}
}

