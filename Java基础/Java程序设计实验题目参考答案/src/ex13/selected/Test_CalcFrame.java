package ex13.selected;

import javax.swing.JFrame;
/**
 * ѡ���⣺��ѧ������2
 *��������� 
 * @author ������
 * 2017.6
 * jdk1.7�����ϰ汾
 *
 */
public class Test_CalcFrame {

	public static void main(String[] args) {
		JFrame app = new CalcFrame("��ѧ������" );		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 230,440);
        app.setVisible( true );

	}
}
