package ex12;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 * @content:ʵ��һ��������
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��11������9:45:06
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��11������9:45:06
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Calculator extends JFrame{
	/**
	 * Propose:
	 */
	private static final long serialVersionUID = 1L;
	//�Զ���ı���
	private double result; // ��������Ľ��
	private boolean start; //�����ж��Ƿ����״���������,true�״�,false�����״�
	private boolean flag; // �����ж��Ƿ������ʾ�����ֵ,true��Ҫ,false����Ҫ
	private String lastCommand; //���ڱ��������
	/**
	 * ���캯����ʼ������
	 */
	public Calculator() {
	  result = 0;     start = true;
	  flag = false;   lastCommand = "=";
	 //��Ϊ������ʽ���֣���������Ĵ��˳���������˳��һ�£�������
	  String[] buttoname = {"7","8","9","+","4","5","6","��","1","2","3","*","0",".","=","/"};
	//���ʵ�ֵĲ��ֽ���
	  initComponents();
	//��˳����Ӱ�ť�ı��Լ���Ӧ���¼�
	  for (int i = 0; i < buttoname.length; i++) {
		if(Character.isDigit(buttoname[i].charAt(0)))
			addNumButton(buttoname[i],1);
		else
			addNumButton(buttoname[i],0);
	}
	 //���Ľ�������       
	 try {
	      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");//windowClass���
	      SwingUtilities.updateComponentTreeUI(jFrame);
	  } catch (Exception e1) {
	            e1.printStackTrace();
	        }
	   }

		/**
		 * @content����Ӱ�ť�����Ӧ�������¼�ƥ�䣬��ͳһ�����������Լ��ٴ�����
		 * @param buttonName
		 * @param al
		 * @return
		 */
	    private void addNumButton(String buttonName,int i) {
	        JButton jb = new JButton(buttonName);
	        jp.add(jb);//��Ӱ�ť
	        //��Lambda���ʽʵ��������������
	        if(i==1)
	        jb.addActionListener(na->NumberAction(na));//���������¼��밴ťƥ��
	        else 
	        jb.addActionListener(ca->CommandAction(ca));//���������¼��밴ťƥ��
	    }
		
	    /**
          * @content��ʵ�����ּ�����
          * @param na
          * @return
          */
        private void NumberAction(ActionEvent na) {
          JButton jb = (JButton) na.getSource(); // ��ȡ�¼�Դ����
          String input = jb.getText(); // ��ȡ�¼�Դ�����ϵı�ǩ
         // �״�����ʱ
          if (start) { 
        	  /*
        	      *   ����һЩ�Ƿ��������������������Щ�����
        	   */
              // 1.һ�Ͼ�".",��ʲôҲ����
              if (input.equals(".")) {
                  return;
              }
              //2. �����"0.0"�Ļ�,�����(�൱��ʲôҲû��)
              if (display.getText().equals("0.0")) {
                  display.setText("");
              }
              start = false;// �ı��Ƿ��״�����ı��ֵ
          } else {
              // �ж���ʾ�����ֵ�����Ƿ��Ѿ���".",�����,���������".",��ʲô������
              if (display.getText().indexOf(".") != -1) {
                  if (input.equals(".")) {
                      return;
                  }
              }

              // �ж���ʾ�����ֵ����ֻ��"-",���������".",��ʲô������
              if (display.getText().equals("-")) {
                  if (input.equals(".")) {
                      return;
                  }
              }

              // �ж���ʾ�����ֵ�����"0",����Ĳ���".",��ʲôҲ����
              if (display.getText().equals("0")) {
                  if (!input.equals(".")) {
                      return;
                  }
              }
          }
          // ����ҵ����������Ժ�,���������ֵĻ�,��Ҫ�����ʾ�����ֵ
          if (flag) {
              display.setText("");
              flag = false;// ��ԭ��ʼֵ,����Ҫ���
          }
          display.setText(display.getText() + input);// ������ʾ�����ֵ

		}

	    /**
	     * @content��  �����������
	     * @param ca
	     * @return
	     */
        private void CommandAction(ActionEvent ca) {
           JButton jb = (JButton) ca.getSource(); // ��ȡ�¼�Դ����
           String inputCommand = jb.getText(); // ��ȡ�¼�Դ�����ϵı�ǩ
           if (start) {// �״�����
               // һ�Ͼ���"-"
               if (inputCommand.equals("-")) {
                   display.setText("-");// ��ʾ�������������Ϊ"-"
                   start = false;// �ı��״�����ı��
               }
           } else {

               if (!flag) {// ���flag=false����Ҫ�����ʾ����ֵ,�͵��÷�������
                   calculate(Double.parseDouble(display.getText()));// ������ʾ�����ֵ,������
               }
               // ���������������
               lastCommand = inputCommand;
               flag = true;// ��Ϊ�������Ѿ�����������,
           }
		}
 
    // �����õķ���
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

    //clean���Ĺ��ܣ��ظ���ʼֵ
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
	
	//������ʵ�ֹ���
	public static void main(String[] args) {
		new Calculator();
	}
	
}

