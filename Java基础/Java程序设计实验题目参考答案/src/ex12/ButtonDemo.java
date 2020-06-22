package ex12;

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
 * @author 04162130.������.
 * @ʱ�� 2017.05.27.
 * @��Ŀ  ʵ������2
 * ����Swing���ʵ��һ��(�ʺ�����)(�����¼�����)
 * �α�ϰ��7.
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
		
		JButton jbt1 = new JButton("���");
		JButton jbt2 = new JButton("�ټ�");
		
		jbt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jf.setText("��ã�****");
			}
		}
		);
		
		jbt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jf.setText("�ټ���****");
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
