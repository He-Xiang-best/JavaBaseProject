package ex12.sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * �ڰ��½���ʵ���˼���������
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
		this.setTitle("������");		
		
		//Ĭ�ϵĲ����Ǳ߽粼�ֹ�����
		Container c=this.getContentPane();
		//������ϲ��ֵ��ı��༭��
		w=new JTextField(20);
	    c.add(w,"North");
	    
	    //����м�İ�ť����
		c.add(new Middle(),"Center");
		
		//��������沿�ֵ���հ�ť
		Button cl=new Button("CE/C");
		cl.setBackground(Color.orange);
		c.add(cl,"South");
		pack();
		
	}
}
	/**
	 * �м䲿�����а�ťͳһ����һ�������Middle��
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
