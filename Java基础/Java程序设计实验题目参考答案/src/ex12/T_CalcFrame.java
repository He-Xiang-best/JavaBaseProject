package ex12;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JPanel;
public class T_CalcFrame extends JFrame {
	
	public T_CalcFrame(String name)
	{
		super(name);
		Container c=getContentPane();
		JPanel box=new JPanel();
		JPanel col[]=new JPanel[5];
		for(int i=0;i<5;++i)
			col[i]=new JPanel();
		box.setLayout(new BoxLayout(box,BoxLayout.Y_AXIS));
		final JTextField text=new JTextField("",36);
		text.setHorizontalAlignment(JTextField.RIGHT);
		JButton buttons[]=new JButton[16];
		final String hai[]={"1","2","3","+","4","5","6","-","7","8","9","*","0",".","=","/"};
		box.add(text);
		for(int i=0;i<16;++i){
			buttons[i]=new JButton(hai[i]);
//			if(i!=14){
//			buttons[i].addActionListener(new ActionListener()
//			{
//		public void actionPerformed(ActionEvent e) {
//			
//			text.setText(text.getText()+hai[i]);
//		}
//		});
//			}else
//			{
//				buttons[14].addActionListener(new ActionListener()
//				{
//			public void actionPerformed(ActionEvent e) {
//				String t=text.getText();
//				String t1=cal(t);
//				text.setText(t1);
//			}
//			});
//			}
		}
		

				buttons[0].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				
				text.setText(text.getText()+hai[0]);
			}
			});
				buttons[1].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[1]);
			}
			});
				buttons[2].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[2]);
			}
			});
				buttons[3].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[3]);
			}
			});
				buttons[4].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[4]);
			}
			});
				buttons[5].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[5]);
			}
			});
				buttons[6].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[6]);
			}
			});
				buttons[7].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[7]);
			}
			});
				buttons[8].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[8]);
			}
			});
				buttons[9].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[9]);
			}
			});
				buttons[10].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[10]);
			}
			});
				buttons[11].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[11]);
			}
			});
				buttons[12].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[12]);
			}
			});
				buttons[13].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[13]);
			}
			});
				buttons[14].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				String t=text.getText();
				String t1=cal(t);
				text.setText(t1);
			}
			});
				buttons[15].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText()+hai[15]);
			}
			});
	for(int i=0;i<16;++i){
			col[i/4].add(buttons[i]);
			if((i+1)%4==0)
				box.add(col[i/4]);
		}
	JButton ce=new JButton("CE/E");
	ce.setPreferredSize(new Dimension(170,27));
	ce.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e) {
			text.setText("");
			}
		});
		col[4].add(ce);
		box.add(col[4]);
		c.add(box);
		}
	public static String cal(String t){//两个数运算
		String b[]=new String[2];
		b[0]=new String();
		b[1]=new String();
		
		int count=0;
		char OP = '+';
		for(int i=0;i<t.length();++i)
		{
			if(t.charAt(i)!='*'&&t.charAt(i)!='/'&&t.charAt(i)!='+')
			{
				if(i>0&&t.charAt(i)=='-')
					if(t.charAt(i-1)>'0'||t.charAt(i-1)<9)
						++count;
				b[count]=b[count]+Character.toString(t.charAt(i));
			}
			else 
			{
				OP=t.charAt(i);
				++count;
				if(count==2)
					return "error";
			}
		}
		//String b[]=t.split("[\\+\\-\\*\\/]");
		/**
		 * 坑人的split 
		 * String a="-2.3+898";
		 * String b[]=a.split("[\\+\\-\\*\\/]");
		 * 分割出三个
		 */
		int count_point=0;
		for(int i=0;i<t.length();++i){
			if(t.charAt(i)=='.'){
				count_point++;
			}
			if(count_point>1)
				return "error";
		}
				switch(OP){
			case '+':
				return Double.parseDouble(b[0])+Double.parseDouble(b[1])+"";
			case '-':
				return Double.parseDouble(b[0])-Double.parseDouble(b[1])+"";
			case '*':			
				return Double.parseDouble(b[0])*Double.parseDouble(b[1])+"";
			case '/':			
				return Double.parseDouble(b[0])/Double.parseDouble(b[1])+"";
			}
			return "hello";
			}
			
	}


