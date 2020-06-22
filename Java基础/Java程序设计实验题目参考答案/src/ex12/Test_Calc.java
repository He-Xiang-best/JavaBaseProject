package ex12;

import javax.swing.JFrame;

public class Test_Calc {

	public static void main(String[] args) {
		JFrame app = new CalcFrame( );		
		//JFrame app=new T_CalcFrame("¼ÆËãÆ÷");
		//JFrame app=new Calculator();
		//app.setResizable(false);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 230,440);
        app.setVisible( true );

	}
}
