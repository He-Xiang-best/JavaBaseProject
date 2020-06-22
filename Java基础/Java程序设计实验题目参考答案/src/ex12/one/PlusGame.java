package ex12.one;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.*;
/**
 * �ڰ��� ���׼���������
 * ʵ����һ
 * @author Administrator
 * 2017.5.23
 */
public class PlusGame extends JFrame{	

	private JLabel l1 = new JLabel();
	private JLabel l2 = new JLabel();
	private JButton b1 = new JButton();
	private JTextField text1 = new JTextField(10);
	private JTextField text2 = new JTextField(10);
	private JTextField text3 = new JTextField(10);

	public PlusGame()
	{
		//���ô��ڵ�����
		super("���׼�����");
		this.setSize(640, 310);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		//�������������
		l1.setText("�ӷ�����:");
		l2.setText("+");
		b1.setText("=");
		b1.setSize(50, 30);
		text3.setEditable(false);
		//���������ڿ����
		Container  mc= this.getContentPane();
		add(l1);
		mc.add(text1);
		mc.add(l2);
		mc.add(text2);
		mc.add(b1);
		mc.add(text3);		

		b1.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				Add();
			}
		});
	}

	private void Add()
	{
		Double a = Double.valueOf(text1.getText());
		Double b = Double.valueOf(text2.getText());
		Double sum = a+b;
		DecimalFormat df = new DecimalFormat("#0.00");  
		text3.setText(df.format(sum));
	}




}
