package ex12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * @content:实现加法计算机布局
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月11日下午9:04:57
 * @第一次修改的时间：
 * @time:2020年6月11日下午9:04:57
 * @修改原因：课堂测验，修改内容：
 */
public class PlusGame extends JFrame {
	/**
	 * Propose:
	 */
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		new PlusGame();
	}
	
	public PlusGame() {
		//调用插件所生成的界面
		initComponents();
	}
	
    //用等号实现求和事件
	private void button1ActionPerformed(ActionEvent e) {
		String num1 = JT1.getText();
		String num2 = JT2.getText();
		Double sum = Double.parseDouble(num1) + Double.parseDouble(num2);
		JT3.setText(" " + sum);
	}

	//插件完成界面布局
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		JT1 = new JTextField();
		label2 = new JLabel();
		JT2 = new JTextField();
		button1 = new JButton();
		JT3 = new JTextField();
		label3 = new JLabel();

		//======== this ========
		setTitle("plus game\uff01\uff01");
		setVisible(true);
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("\u52a0\u6cd5\u8fd0\u7b97\uff1a");
		label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));

		//---- label2 ----
		label2.setText("+");

		//---- button1 ----
		button1.setText("=");
		button1.addActionListener(e -> button1ActionPerformed(e));

		//---- label3 ----
		label3.setText("+");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(label1)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(JT1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label3)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(JT2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(button1)
					.addGap(18, 18, 18)
					.addComponent(JT3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(2, 2, 2)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label1)
						.addComponent(label2)
						.addComponent(JT1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label3)
						.addComponent(JT2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(JT3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button1))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField JT1;
	private JLabel label2;
	private JTextField JT2;
	private JButton button1;
	private JTextField JT3;
	private JLabel label3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
