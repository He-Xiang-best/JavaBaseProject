package ex13.selected;

import javax.swing.JFrame;
/**
 * 选做题：科学计算器2
 *主程序入口 
 * @author 王俊斌
 * 2017.6
 * jdk1.7及以上版本
 *
 */
public class Test_CalcFrame {

	public static void main(String[] args) {
		JFrame app = new CalcFrame("科学计算器" );		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 230,440);
        app.setVisible( true );

	}
}
