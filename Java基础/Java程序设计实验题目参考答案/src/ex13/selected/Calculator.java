package ex13.selected;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * ѡ���⣺��ѧ������1
 * @author Administrator
 *
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
		pd=true;
		bj="=";
		result=0;
		//������ϲ��ֵ��ı��༭��
		w=new JTextField(20);
		Container c=this.getContentPane();
	    c.add(w,"North");
	    
	    //����м�İ�ť����
		c.add(new m(),"Center");
		
		//��������沿�ֵ���հ�ť
		Button cl=new Button("CE/C");
		cl.setBackground(Color.orange);
		
		cl.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				w.setText("");
				
			}
			
		});
		c.add(cl,"South");
		pack();
		
	}
	class m extends JComponent
	{
		public m()
		{	
			setLayout(new GridLayout(4,4));
			addbutton("7",new sz());
			addbutton("8",new sz());
			addbutton("9",new sz());
			addbutton("/",new jx());
			addbutton("4",new sz());
			addbutton("5",new sz());
			addbutton("6",new sz());
			addbutton("*",new jx());
			addbutton("1",new sz());
			addbutton("2",new sz());
			addbutton("3",new sz());
			addbutton("+",new jx());
			addbutton("0",new sz());
			addbutton(".",new sz());
			addbutton("=",new jx());
			addbutton("-",new jx());
		}
		public void addbutton(String name,ActionListener e)
		{
			JButton an=new JButton(name);
			an.addActionListener(e);
			add(an);
		}
		class sz implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				String sb=e.getActionCommand();
				if(pd)
				{
					w.setText("");
					pd=false;
				}
				w.setText(w.getText()+sb);
			}
		}
		class jx implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				String jb=e.getActionCommand();
				if(pd)
				{
					jb.equals("-");
					w.setText(jb);
					pd=false;
				}
				else{
				js(Double.parseDouble(w.getText()));
				bj=jb;
				pd=true;		
				}
			}
		}
		class cle implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				w.setText("");
			}
		}
		public void js(double jsb)
		{
			if(bj.equals("/")) result/=jsb;
			if(bj.equals("*")) result*=jsb;
			if(bj.equals("+")) result+=jsb;
			if(bj.equals("-")) result-=jsb;
			if(bj.equals("=")) result=jsb;
			w.setText(""+result);
		}
	}
}
