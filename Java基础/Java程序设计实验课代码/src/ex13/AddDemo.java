package ex13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
/**
 * @content:编写一个程序，在第一个文本框中输入第一个加数，
 *          在第二个文本框中输入第二个数，
 *          当鼠标单击按钮“＝”时，在第三个文本框中显示前两个加数的和。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月18日上午10:59:32
 * @第一次修改的时间：
 * @time:2020年6月18日上午10:59:32
 * @修改原因：课堂测验，修改内容：
 */
public class AddDemo extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JTextField JT1, JT2, JT3;
	JLabel JL0, JL1;
	JButton JB;

	AddDemo() {
		setTitle("plus game！！");
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		JL0 = new JLabel("加法运算：");
		JT1 = new JTextField(5);
		JL1 = new JLabel("+");
		JT2 = new JTextField(5);
		JB = new JButton("=");
		JT3 = new JTextField(5);
		cp.add(JL0);
		cp.add(JT1);
		cp.add(JL1);
		cp.add(JT2);
		cp.add(JB);
		cp.add(JT3);
		JT3.setEditable(false);
		JB.addActionListener(this);
		setSize(400,100);
		setResizable(false);
		setLocationRelativeTo(getOwner());
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String add1 = JT1.getText();
		String add2 = JT2.getText();
		Double sum = Double.parseDouble(add1) + Double.parseDouble(add2);
		JT3.setText(" " + sum);
	}

	public static void main(String[] args) {
		 new AddDemo();
	}

}
