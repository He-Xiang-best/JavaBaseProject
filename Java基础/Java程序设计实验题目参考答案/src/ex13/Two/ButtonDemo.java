package ex13.Two;

import java.awt.Container;
import java.awt.BorderLayout;
//import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author 04162130.王俊斌.
 * @时间 2017.05.27.
 * @项目  实验任务2
 * 利用Swing编程实现一个(问候例程)(动作事件例程)
 * 课本习题7.
 */

public class ButtonDemo extends JFrame{
	public ButtonDemo(){
		super("Button Demo");
		
		Container c = getContentPane();
		
		final JTextField jf = new JTextField();
		jf.setHorizontalAlignment(JTextField.CENTER);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		JButton jbt [] = new JButton[3];
		
		for(int i = 0;i < jbt.length;i++){
			jbt[i] = new JButton("" + (i+1));
			jbt[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					jf.setText("");
				}
			});
			p1.add(jbt[i]);
		}
		
		JButton jbt1 = new JButton("你好");
		JButton jbt2 = new JButton("再见");
		
		jbt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jf.setText("你好，****");
			}
		}
		);
		
		jbt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jf.setText("再见，****");
			}
		}
		);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(jbt1);
		p2.add(jbt2);
		
		c.add(p1,BorderLayout.NORTH);
		c.add(jf,BorderLayout.CENTER);
		c.add(p2,BorderLayout.SOUTH);
	}
	
	public static void main(String args[]){
		ButtonDemo a = new ButtonDemo();
		a.setSize(200,150);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setVisible(true);
	}
	
}
