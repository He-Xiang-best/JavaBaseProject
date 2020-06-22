package ex13.selected;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;

import javax.swing.*;
/**
 * 第八章选做题。四则运算器
 * @author Administrator
 * 2017.6.5
 */
public class SimpleCalculator {
	
	private JFrame MainFrame = new JFrame("Calculator");
	private Container MainContainer = MainFrame.getContentPane();
	private JTextField Text1 = new JTextField(10);
	private JTextField Text2 = new JTextField(10);
	private JTextField Text3 = new JTextField(10);
	private JLabel L1 = new JLabel();
	private String s[] = {"+","-","x","÷"};
	private JComboBox Box1 = new JComboBox(s);
	private JButton B1 = new JButton("=");
	
	SimpleCalculator(){
		MainFrame.setSize(600, 200);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.setVisible(true);
		MainFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		MainContainer.add(L1);
		MainContainer.add(Text1);
		MainContainer.add(Box1);
		MainContainer.add(Text2);
		MainContainer.add(B1);
		MainContainer.add(Text3);
		
		B1.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent e)
			{
				if(Judge()){
					JOptionPane.showMessageDialog(null, "请填写完整!");
					return;
				}
				String s = (String) Box1.getSelectedItem();
				switch(s.charAt(0)){
					case'+':{Add();break;}
					case'-':{Sub();break;}
					case'x':{Mul();break;}
					case'÷':{Div();break;}
				}
			}
			
		});
	}
	
	private boolean Judge()
	{
		if(Text1.getText().isEmpty()||Text2.getText().isEmpty())
			return true;
		else
			return false;
	}
	
	private void Add()
	{
		Double a = Double.valueOf(Text1.getText());
		Double b = Double.valueOf(Text2.getText());
		Double Result = a+b;
		NumberFormat N = NumberFormat.getNumberInstance();
		N.setMaximumFractionDigits(2);
		Text3.setText(N.format(Result));
	}
	
	private void Sub()
	{
		Double a = Double.valueOf(Text1.getText());
		Double b = Double.valueOf(Text2.getText());
		Double Result = a-b;
		NumberFormat N = NumberFormat.getNumberInstance();
		N.setMaximumFractionDigits(2);
		Text3.setText(N.format(Result));
	}
	
	private void Mul()
	{
		Double a = Double.valueOf(Text1.getText());
		Double b = Double.valueOf(Text2.getText());
		Double Result = a*b;
		NumberFormat N = NumberFormat.getNumberInstance();
		N.setMaximumFractionDigits(2);
		Text3.setText(N.format(Result));
	}
	
	private void Div()
	{
		Double a = Double.valueOf(Text1.getText());
		Double b = Double.valueOf(Text2.getText());
		Double Result = a/b;
		NumberFormat N = NumberFormat.getNumberInstance();
		N.setMaximumFractionDigits(2);
		Text3.setText(N.format(Result));
	}

}
