package ex12;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CalculatorPanel extends JPanel{
	
	private JButton display;
	private JPanel panel;
	private double result;
	private String lastCommand;
	private boolean start;
	
	//���Ϊ�˽� 2.0��Ϊ2,�����޶�С��λΪ��λ
	private DecimalFormat mDecimalFormat = new DecimalFormat("0.#########");
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					JFrame frame = new JFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					frame.setSize(500, 400);
					frame.add(new CalculatorPanel());
			}
		});
	}

	
	public CalculatorPanel(){
	
		setLayout(new BorderLayout());
		
		result = 0;
		lastCommand = "=";
		start = true;
		display = new JButton("0");
	
		add(display,BorderLayout.NORTH);
		
		display.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result = 0;
				start = true;
				display.setText("0");
				
			}
		});
		
		
		ActionListener insert = new InsertAction();
		ActionListener command = new CommandAction();
		
		panel = new JPanel();
		//panel.add(display , BorderLayout.NORTH);
		panel.setLayout(new GridLayout(4, 4));
		
		addButton("7",insert);
		addButton("8",insert);
		addButton("9",insert);
		addButton("/",command);
		
		addButton("4",insert);
		addButton("5",insert);
		addButton("6",insert);
		addButton("*",command);
		
		addButton("1",insert);		
		addButton("2",insert);
		addButton("3",insert);
		addButton("-",command);

		addButton("0",insert);
		addButton(".",insert);
		addButton("=",command);
		addButton("+",command);

		add(panel , BorderLayout.CENTER );
	}
	
	private void addButton(String label ,ActionListener listener){
		JButton button = new JButton(label);
		button.addActionListener(listener);
		panel.add(button);
	}

	private class InsertAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			String input = event.getActionCommand();
			if(start ){
				if( !input.equals(".") )
					display.setText("");
				start = false;
			}else{
				if(display.getText().equals("-") && input.equals(".") ){
					return;
				}
			}
			display.setText(display.getText() + input);
		}
	}
	
	private class CommandAction implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			String command = event.getActionCommand();
			if(start){
				//֧�ָ������߼�.. �����-��Ȼ���ٵ�����־������븺����
				if(command.equals("-")){
					display.setText(command);
					start = false;
				}else{
					lastCommand = command;
				}
			}else{
				if(display.getText().equals("-") ) return;
				//Double.parseDouble( display.getText() ); ��������ǽ��ı���ȡΪint���ͣ���ǿת..
				calculate( Double.valueOf(display.getText()) );
				lastCommand = command;
				start = true;
			}
		}

		private void calculate(double x) {
			
			if(lastCommand.equals("+")) result += x;
			else if(lastCommand.equals("-")) result -= x;
			else if(lastCommand.equals("*")) result *= x;
			else if(lastCommand.equals("/")) result /= x;
			else if(lastCommand.equals("=")) result =  x;
			display.setText( mDecimalFormat.format(result) );
		}
	}
}
