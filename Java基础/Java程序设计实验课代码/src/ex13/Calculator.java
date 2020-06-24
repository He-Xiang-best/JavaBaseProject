package ex13;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 * @content:实现一个计算器
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月18日下午4:45:06
 * @第一次修改的时间：
 * @time:2020年6月18日下午4:45:06
 * @修改原因：课堂测验，修改内容：
 */
public class Calculator extends JFrame{
	/**
	 * Propose:
	 */
	private static final long serialVersionUID = 1L;
	//自定义的变量
	private double result; // 计算运算的结果
	private boolean start; //用于判断是否是首次输入数据,true首次,false不是首次
	private boolean flag; // 用于判断是否清空显示区域的值,true需要,false不需要
	private String lastCommand; //用于保存运算符
	/**
	 * 构造函数初始化数据
	 */
	public Calculator() {
	  result = 0;     start = true;
	  flag = false;   lastCommand = "=";
	 //因为是网格式布局，所以数组的存放顺序需与界面顺序一致，从左到右
	  String[] buttoname = {"7","8","9","+","4","5","6","—","1","2","3","*","0",".","=","/"};
	//插件实现的部分界面
	  initComponents();
	//按顺序添加按钮文本以及对应的事件
	  for (int i = 0; i < buttoname.length; i++) {
		if(Character.isDigit(buttoname[i].charAt(0)))
			addNumButton(buttoname[i],1);
		else
			addNumButton(buttoname[i],0);
	}
	 //更改界面主题       
	 try {
	      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");//windowClass风格
	      SwingUtilities.updateComponentTreeUI(jFrame);
	  } catch (Exception e1) {
	            e1.printStackTrace();
	        }
	   }

		/**
		 * @content：添加按钮与其对应发生的事件匹配，用统一函数方法可以减少代码量
		 * @param buttonName
		 * @param al
		 * @return
		 */
	    private void addNumButton(String buttonName,int i) {
	        JButton jb = new JButton(buttonName);
	        jp.add(jb);//添加按钮
	        //用Lambda表达式实例化监听器对象
	        if(i==1)
	        jb.addActionListener(na->NumberAction(na));//将发生的事件与按钮匹配
	        else 
	        jb.addActionListener(ca->CommandAction(ca));//将发生的事件与按钮匹配
	    }
		
	    /**
          * @content：实现数字监听器
          * @param na
          * @return
          */
        private void NumberAction(ActionEvent na) {
          JButton jb = (JButton) na.getSource(); // 获取事件源对象
          String input = jb.getText(); // 获取事件源对象上的标签
         // 首次输入时
          if (start) { 
        	  /*
        	      *   考虑一些非法操作（可上网查查有哪些情况）
        	   */
              // 1.一上就".",就什么也不做
              if (input.equals(".")) {
                  return;
              }
              //2. 如果是"0.0"的话,就清空(相当于什么也没做)
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

	    /**
	     * @content：  运算符监听器
	     * @param ca
	     * @return
	     */
        private void CommandAction(ActionEvent ca) {
           JButton jb = (JButton) ca.getSource(); // 获取事件源对象
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

    //clean键的功能，回复初始值
	private void cleanActionPerformed(ActionEvent e) {
		// TODO add your code here
		 result = 0;
         start = true;
         flag = false;
         lastCommand = "=";
         display.setText("0.0");
	}
    
    
    
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

			//---- display ----
			display.setBackground(new Color(158, 255, 158));
			display.setHorizontalAlignment(SwingConstants.RIGHT);
			display.setText("0.0");
			display.setEnabled(false);
			display.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.BOLD, 27));
			display.setDisabledTextColor(Color.black);

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
	
	//主函数实现功能
	public static void main(String[] args) {
		new Calculator();
	}
	
}

