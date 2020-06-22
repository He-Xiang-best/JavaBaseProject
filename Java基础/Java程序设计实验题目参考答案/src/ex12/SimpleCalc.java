package ex12;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author 王俊斌.
 * @since 2017.05.27.
 * 利用Swing编 程实现一个加法计算器(动作事件例程)
 * 
 */

public class SimpleCalc extends JFrame{
	protected JLabel jl = new JLabel("加法运算:");
	protected JLabel j2 = new JLabel("+");
	protected JTextField jf1 = new JTextField(5);
	protected JTextField jf2 =  new JTextField(5);
	protected JTextField jf3 =  new JTextField(5);
	protected JButton jbt = new JButton("=");

	public SimpleCalc(){
		//构建界面
		super("Simple  Calc");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());	
		jf3.setEditable(false);
		c.add(jl);
		c.add(jf1);
		c.add(j2);
		c.add(jf2);
		c.add(jbt);
		c.add(jf3);
		//添加监听器
		jbt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					double a = Double.parseDouble(jf1.getText());
					double b = Double.parseDouble(jf2.getText());
					jf3.setText("" + (a+b));				
				}catch(Exception ex){
					jf3.setText("输入错误");
				}
			}
		});		
	}

	public static void main(String args[]){
		SimpleCalc a = new SimpleCalc();
		a.setSize(500,70);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setVisible(true);
	}
}
