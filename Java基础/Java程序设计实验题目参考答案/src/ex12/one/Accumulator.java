package ex12.one;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * �ڰ���ѡ���⡣����������
 * @author Administrator
 * 2017.6.5
 */
public class Accumulator extends JFrame implements ActionListener{

	public double result=0;
	static String is="+";
	JTextField  jt1 = new JTextField(10);
	JTextField  jt2 = new JTextField(10);
	JTextField  jt3 = new JTextField(10);
	JComboBox jcb = new JComboBox();
	JButton   jb = new JButton("=");
	
	public Accumulator(){
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		
		jcb.addItem("+");
		jcb.addItem("-");
		jcb.addItem("*");
		jcb.addItem("/");
		
		jp.add(jt1);
		jp.add(jcb);
		jp.add(jt2);
		jp.add(jb);
		jp.add(jt3);

		jb.addActionListener(this);
        this.setTitle("���������");
		this.add(jp);
		this.setBounds(400, 350, 500, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

	@Override 
	/**
	 * ʵ�ּ��������¼�������
	 * �õ��б���ѡ����
	 * �ֱ�ԼӼ��˳����д���
	 */
	public void actionPerformed(ActionEvent ae) {
		is=(String)jcb.getSelectedItem();
	 if(ae.getSource()==jb){
		 
		if(is.equals("+")){
			try{
			result =Double.parseDouble(jt1.getText())+Double.parseDouble(jt2.getText());
			jt3.setText(String.valueOf(result));
			}catch(NumberFormatException e){
				System.out.print(e.getMessage());
				jt3.setText("�������");;
			}			
		}
		
		if(is.equals("-")){
			try{
			result =Double.parseDouble(jt1.getText())-Double.parseDouble(jt2.getText());
			jt3.setText(String.valueOf(result));
			}catch(NumberFormatException e){
				System.out.print(e.getMessage());
				jt3.setText("�������");;
			}	
		}
		
		if(is.equals("*")){
			try{
			result =Double.parseDouble(jt1.getText())*Double.parseDouble(jt2.getText());
			jt3.setText(String.valueOf(result));
			}catch(NumberFormatException e){
				System.out.print(e.getMessage());
				jt3.setText("�������");;
			}
		}
		if(is.equals("/")){
			try{
			result =Double.parseDouble(jt1.getText())/Double.parseDouble(jt2.getText());
			jt3.setText(String.valueOf(result));
			}catch(NumberFormatException e){
				System.out.print(e.getMessage());
				jt3.setText("�������");;
			}
		}
		}
	}
	

	
}
