package ex12;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author 04162130.王俊斌.
 * @时间 2017.05.27.
 * @项目  实验任务3(选做)
 * 利用Swing编程实现一个简单计算器(动作事件例程)
 * (含有加,减,乘,除运算)
 */

public class SimpleCalcDemo extends JFrame{
	protected JLabel jl = new JLabel();
	protected JTextField jf1 = new JTextField(5);
	protected JTextField jf2 =  new JTextField(5);
	protected JTextField jf3 =  new JTextField(5);
	protected JButton jbt = new JButton("=");
	protected String s[] = {"+","-","*","/"};
	protected JComboBox jcb = new JComboBox(s);
	protected double num1;
	protected double num2;
	
	public SimpleCalcDemo(){
		super("SimpleCalc Demo");
		
		jf3.setEditable(false);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		jcb.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						JComboBox a = (JComboBox)e.getSource();
						String ss = a.getSelectedItem().toString();
						
						if(ss == "+"){
							jl.setText("加法运算：");
						}
						else if(ss == "-"){
							jl.setText("减法运算：");
						}
						else if(ss == "*"){
							jl.setText("乘法运算：");
						}
						else if(ss == "/"){
							jl.setText("除法运算：");
						}
					}
				}
		);
		jbt.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						num1 = Double.parseDouble(jf1.getText());
						num2 = Double.parseDouble(jf2.getText());
						String ss = jcb.getSelectedItem().toString();
						
						if(ss == "+"){
							jf3.setText("" + (num1 + num2));
						}
						else if(ss == "-"){
							jf3.setText("" + (num1 - num2));
						}
						else if(ss == "*"){
							jf3.setText("" + (num1 * num2));
						}
						else if(ss == "/"){
							jf3.setText("" + (num1 / num2));
						}
					}
				}
		);
	
		jcb.setSelectedIndex(0);
		c.add(jl);
		c.add(jf1);
		c.add(jcb);
		c.add(jf2);
		c.add(jbt);
		c.add(jf3);
	}
	
	public static void main(String args[]){
		SimpleCalcDemo a = new SimpleCalcDemo();
		a.setSize(500,100);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setVisible(true);
	}
}
