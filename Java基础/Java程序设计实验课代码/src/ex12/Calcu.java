
package ex12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author 何翔
 */
public class Calcu extends JFrame {
	/**
	 * Propose:
	 */
	private static final long serialVersionUID = 1L;
	    private double result; // 计算结果
	    private boolean start; // 用于判断是否是首次输入,true首次,false不是首次
	    private boolean flag; // 用于判断是否清空显示区域的值,true需要,false不需要
	    private String lastCommand; // 用于保存运算符
	public static void main(String[] args) {
		new Calcu();
	}
	public Calcu() {
        // 初始化各项值
      result = 0;     start = true;
      flag = false;   lastCommand = "=";
		initComponents();
        // 实例化监听器对象
        NumberAction na = new NumberAction();
        CommandAction ca = new CommandAction();
        //按顺序添加按钮文本以及对应的事件
        addButton("7", na);addButton("8", na);addButton("9", na);addButton("+", ca);
        addButton("4", na);addButton("5", na);addButton("6", na);addButton("—", ca);
        addButton("1", na);addButton("2", na);addButton("3", na);addButton("*", ca);
        addButton("0", na);addButton(".", ca);addButton("=", ca);addButton("/", ca);
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");//windowClass风格
            SwingUtilities.updateComponentTreeUI(jFrame);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
   }
	
    private void addButton(String buttonName, ActionListener al) {
        JButton jb = new JButton(buttonName);
        jp.add(jb);//添加按钮
        jb.addActionListener(al);//将发生的事件与按钮匹配
    }
    
    // 数字监听器
    private class NumberAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton jb = (JButton) e.getSource(); // 获取事件源对象
            String input = jb.getText(); // 获取事件源对象上的标签
            if (start) { // 首次输入
                // 一上就".",就什么也不做
                if (input.equals(".")) {
                    return;
                }
                // 如果是"0.0"的话,就清空
                if (display.getText().equals("0.0")) {
                    display.setText("");
                }
                start = false;// 改变是否首次输入的标记值
            } else {
                // 判断显示区域的值里面是否已经有".",如果有,输入的又是".",就什么都不做
                if (display.getText().indexOf(".") != -1) {
                    if (input.equals(".")) {
                        return;
                    }
                }

                // 判断显示区域的值里面只有"-",输入的又是".",就什么都不做
                if (display.getText().equals("-")) {
                    if (input.equals(".")) {
                        return;
                    }
                }

                // 判断显示区域的值如果是"0",输入的不是".",就什么也不做
                if (display.getText().equals("0")) {
                    if (!input.equals(".")) {
                        return;
                    }
                }
            }
            // 如果我点击了运算符以后,再输入数字的话,就要清空显示区域的值
            if (flag) {
                display.setText("");
                flag = false;// 还原初始值,不需要清空
            }
            display.setText(display.getText() + input);// 设置显示区域的值
        }
    }

    // 运算符监听器
    private class CommandAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton jb = (JButton) e.getSource(); // 获取事件源对象
            String inputCommand = jb.getText(); // 获取事件源对象上的标签

            if (start) {// 首次输入
                // 一上就是"-"
                if (inputCommand.equals("-")) {
                    display.setText("-");// 显示区域的内容设置为"-"
                    start = false;// 改变首次输入的标记
                }
            } else {

                if (!flag) {// 如果flag=false不需要清空显示区的值,就调用方法计算
                    calculate(Double.parseDouble(display.getText()));// 保存显示区域的值,并计算
                }
                // 保存你点击的运算符
                lastCommand = inputCommand;
                flag = true;// 因为我这里已经输入过运算符,
            }
        }
    }

    // 计算用的方法
    private void calculate(double x) { 
        if (lastCommand.equals("+")) {
            result += x;
        } else if (lastCommand.equals("-")) {
            result -= x;
        } else if (lastCommand.equals("*")) {
            result *= x;
        } else if (lastCommand.equals("/")) {
            result /= x;
        } else if (lastCommand.equals("=")) {
            result = x;
        }
        display.setText("" + result);
    }

    //清除键功能事件：
	private void cleanActionPerformed(ActionEvent e) {
		 result = 0;
         start = true;
         flag = false;
         lastCommand = "=";
         display.setText("0.0");
		// TODO add your code here
	}
    
    
    //自己修改以及结合插件完成的页面：
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		jFrame = new JFrame();
		display = new JTextField();
		jp = new JPanel();
		clean = new JButton();

		//======== jFrame ========
		{
			jFrame.setResizable(false);
			jFrame.setVisible(true);
			jFrame.setBackground(Color.white);
			Container jFrameContentPane = jFrame.getContentPane();
//	        try {
//	            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");//windowClass风格
//	            SwingUtilities.updateComponentTreeUI(jFrame);
//	        } catch (Exception e1) {
//	            e1.printStackTrace();
//	        }
	        
			//---- display ----
			display.setBackground(new Color(158, 255, 158));
			display.setHorizontalAlignment(SwingConstants.RIGHT);
			display.setText("0.0");
			display.setEnabled(false);
			display.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 27));
			display.setForeground(Color.darkGray);

			//======== jp ========
			{
				jp.setBackground(Color.white);
				jp.setLayout(new GridLayout(4, 4));
			}

			//---- clean ----
			clean.setText("CE/C");
			clean.addActionListener(e -> cleanActionPerformed(e));

			GroupLayout jFrameContentPaneLayout = new GroupLayout(jFrameContentPane);
			jFrameContentPane.setLayout(jFrameContentPaneLayout);
			jFrameContentPaneLayout.setHorizontalGroup(
				jFrameContentPaneLayout.createParallelGroup()
					.addComponent(jp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(jFrameContentPaneLayout.createSequentialGroup()
						.addComponent(display, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
					.addComponent(clean, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			jFrameContentPaneLayout.setVerticalGroup(
				jFrameContentPaneLayout.createParallelGroup()
					.addGroup(jFrameContentPaneLayout.createSequentialGroup()
						.addComponent(display, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jp, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(clean, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			jFrame.pack();
			jFrame.setLocationRelativeTo(jFrame.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JFrame jFrame;
	private JTextField display;
	private JPanel jp;
	private JButton clean;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

