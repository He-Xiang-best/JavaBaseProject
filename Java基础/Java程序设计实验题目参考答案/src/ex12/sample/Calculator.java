package ex12.sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 第八章仅仅实现了计算器界面
 * 
 * @author Administrator
 *2017.5.22
 */
public class Calculator extends JFrame
{
	JTextField w;
	private boolean pd;
	private String bj;
	private double result;
	public Calculator()
	{
		this.setTitle("计算器");		
		
		//默认的布局是边界布局管理器
		Container c=this.getContentPane();
		//添加最上部分的文本编辑框
		w=new JTextField(20);
	    c.add(w,"North");
	    
	    //添加中间的按钮部分
		c.add(new Middle(),"Center");
		
		//添加最下面部分的清空按钮
		Button cl=new Button("CE/C");
		cl.setBackground(Color.orange);
		c.add(cl,"South");
		pack();
		
	}
}
	/**
	 * 中间部分所有按钮统一放在一个组件类Middle中
	 * @author Administrator
	 *
	 */
	class Middle extends JComponent
	{
		public Middle()
		{	
			this.setLayout(new GridLayout(4,4));
			addbutton("7");
			addbutton("8");
			addbutton("9");
			addbutton("/");
			addbutton("4");
			addbutton("5");
			addbutton("6");
			addbutton("*");
			addbutton("1");
			addbutton("2");
			addbutton("3");
			addbutton("+");
			addbutton("0");
			addbutton(".");
			addbutton("=");
			addbutton("-");
		}
		public void addbutton(String name)
		{
			JButton an=new JButton(name);
			this.add(an);
		}
		
}
