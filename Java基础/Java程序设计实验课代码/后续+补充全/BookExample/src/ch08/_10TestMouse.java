package ch08;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class _10TestMouse extends JFrame{
	_10DrawPanel tp=new _10DrawPanel();
	public _10TestMouse()
	{
	super("测试鼠标绘图程序");
	Container c=this.getContentPane();
	//设置面板容器，将面板添加到容器上
	c.setLayout(new BorderLayout());
	c.add(tp,BorderLayout.CENTER);
	}
	public static void main(String args[]){
    	_10TestMouse tm=new _10TestMouse();
    	tm.setSize(500,400);
		tm.setVisible(true);
		tm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
