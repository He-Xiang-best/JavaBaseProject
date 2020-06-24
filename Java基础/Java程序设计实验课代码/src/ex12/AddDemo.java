package ex12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.ActionListener;

public class AddDemo extends JFrame implements ActionListener {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	JTextField JT1, JT2, JT3;
	JLabel JL0, JL1;
	JButton JB;

	AddDemo() {
		setTitle("plus game����");
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		JL0 = new JLabel("�ӷ����㣺");
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
	}

	public void actionPerformed(ActionEvent e) {
		String add1 = JT1.getText();
		String add2 = JT2.getText();
		Double sum = Double.parseDouble(add1) + Double.parseDouble(add2);
		JT3.setText(" " + sum);
	}

	public static void main(String[] args) {
		AddDemo t = new AddDemo();
		int width = 500;
		int height = 100;
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension d = tool.getScreenSize();
		t.setResizable(false);
		t.setBounds((d.width - width) / 2, (d.height - height) / 2, width, height);
		t.setVisible(true);
	}

}
