package ex12;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.geom.Ellipse2D;
import java.io.BufferedWriter;
import java.util.Stack;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator extends JFrame{
	String[]num,point;
	public boolean Check_Calculator (String s)
	{
		//System.out.println(s);
		//String[]num;
		int sum=0;
		//String temp;
		char[]a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
//			if(i==1){
//			
//			if(a[i]=='*'||a[i]=='/'||a[i]=='+'||a[i]=='-')
//				return false;
//			}
//			if(a[i]=='*'||a[i]=='/'||a[i]=='+'||a[i]=='-'&&(a[i+1]=='*'||a[i+1]=='/'||a[i+1]=='+'||a[i+1]=='-'))
//				return false;
//			if(a[a.length-1]!='=')
//				return false;
			if(a[i]=='*'||a[i]=='/'||a[i]=='+'||a[i]=='-'||a[i]=='=')
				sum++;
		}
		//System.out.println(sum);
		num=new String[sum];
		point=new String[sum];
		int temp=0,j=0;int k=0;
		for(int i=0;i<a.length;i++)
		{num[k]="";
			if(a[i]=='*'||a[i]=='/'||a[i]=='+'||a[i]=='-'||a[i]=='=')
			{
//				for(int k=temp;j<i;k++)
//				{
				    
//					if(a[0]=='.')
//						for(j=temp;j<i;j++){
//							if(j==0)num[k]="0."+a[j];
//							else
//								num[k]+=a[j];
//						}
//					else
				j=temp;
						for(;j<i;j++){
								if(j==0)num[k]=a[j]+"";
								else num[k]+=a[j];temp=i+1;
						}
					point[k]=a[i]+"";
				//}
				k++;
				
				
			}
		}//System.out.println("222");
		for(int q=0;q<num.length;q++)
		{
			System.out.println(num[q]);
		}
		for(int q=0;q<point.length;q++)
		{
			System.out.println(point[q]);
		}
		return true;
		
	}
	JButton b;int i;TextField screen=new TextField("",10);
	public Calculator()
	{
		super("计算器");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JPanel p[]=new JPanel[3];
		
		
		for(i=0;i<3;i++)
		{
			p[i]=new JPanel();
			if(i==0){
				p[i].setLayout(new FlowLayout());
				p[i].setBackground(Color.red);
			}
			else
				if(i==1)
					p[i].setLayout(new GridLayout(4, 4));
				else
					p[i].setLayout(new FlowLayout());
			c.add(p[i]);
		}
		String s[]={"7","8","9","+","4","5","6","-","1","2","3","*","0",".","=","/"};
		
		screen.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				System.out.println("失去焦点");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				System.out.println("获得焦点");
			}
		});
		screen.setEditable(false);
		p[0].add(screen);
		
		for(i=0;i<s.length;i++)
		{
			b=new JButton(s[i]);
			if(i==14)
			{
				b.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {

						screen.setText(screen.getText()+"=");
						String gString=screen.getText();

						
						if(Check_Calculator(gString))
						{
						double c[]=new double [num.length];
						int n=0;
						int currentLength=num.length;
						try{
							for(int i=0;i<num.length;i++)
						{
								c[i]=Double.parseDouble(num[i]);
						}

							double temp=c[0];
							for(int i=1;i<currentLength;i++)
							{
								System.out.println("运算");

								if(point[i-1].equals("+"))
									temp=temp+c[i-n];
								if(point[i-1].equals("-"))
									{temp=temp-c[i-n];System.out.println("-");}
								if(point[i-1].equals("*"))
									temp*=c[i];
								if(point[i-1].equals("/"))
									temp/=c[i];
							}
							screen.setText(temp+"");
							System.out.println(temp);
						}
						catch(Exception f)
						{
							screen.setText("输入错误");
						f.printStackTrace();
						}	}}
					
			});
			p[1].add(b);
			}
			else{
		
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton b=(JButton)e.getSource();
					screen.setText(screen.getText()+b.getText());
					String gString=screen.getText();						
				}
			});
			p[1].add(b);
		}
		
		}
		b=new JButton("CE/C");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//JButton b=(JButton)e.getSource();
				screen.setText("");
				
				
	}
		});
		b.setPreferredSize(new Dimension(150,30));
		p[2].add(b);
	}
}
