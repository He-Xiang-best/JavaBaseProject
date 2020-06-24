package ex12;

import java.awt.*;
import javax.swing.*;
/**
 * @content:第8章P311_7（纯插件完成）
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月11日下午9:20:39
 * @第一次修改的时间：
 * @time:2020年6月11日下午9:20:39
 * @修改原因：课堂测验，修改内容：
 */
public class ButtonWindow extends JFrame {
	/**
	 * Propose:
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		new ButtonWindow();
	}
	public ButtonWindow() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		button1 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button7 = new JButton();
		button6 = new JButton();

		//======== this ========
		setVisible(true);
		Container contentPane = getContentPane();

		//---- button1 ----
		button1.setText("H");

		//---- button3 ----
		button3.setText("X");

		//---- button4 ----
		button4.setText("\u70ca");

		//---- button5 ----
		button5.setText("handsome");

		//---- button7 ----
		button7.setText("boy");

		//---- button6 ----
		button6.setText("is");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(button1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(button5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(45, 45, 45)
							.addComponent(button6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
									.addComponent(button7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addGap(0, 45, Short.MAX_VALUE)
									.addComponent(button4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(43, 43, 43)
									.addComponent(button3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
							.addGap(22, 22, 22))))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button1)
						.addComponent(button3)
						.addComponent(button4))
					.addGap(29, 29, 29)
					.addComponent(button6)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button5)
						.addComponent(button7))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JButton button1;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button7;
	private JButton button6;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
