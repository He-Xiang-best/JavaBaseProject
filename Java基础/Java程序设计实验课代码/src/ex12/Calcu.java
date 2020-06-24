
package ex12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author ����
 */
public class Calcu extends JFrame {
	/**
	 * Propose:
	 */
	private static final long serialVersionUID = 1L;
	    private double result; // ������
	    private boolean start; // �����ж��Ƿ����״�����,true�״�,false�����״�
	    private boolean flag; // �����ж��Ƿ������ʾ�����ֵ,true��Ҫ,false����Ҫ
	    private String lastCommand; // ���ڱ��������
	public static void main(String[] args) {
		new Calcu();
	}
	public Calcu() {
        // ��ʼ������ֵ
      result = 0;     start = true;
      flag = false;   lastCommand = "=";
		initComponents();
        // ʵ��������������
        NumberAction na = new NumberAction();
        CommandAction ca = new CommandAction();
        //��˳����Ӱ�ť�ı��Լ���Ӧ���¼�
        addButton("7", na);addButton("8", na);addButton("9", na);addButton("+", ca);
        addButton("4", na);addButton("5", na);addButton("6", na);addButton("��", ca);
        addButton("1", na);addButton("2", na);addButton("3", na);addButton("*", ca);
        addButton("0", na);addButton(".", ca);addButton("=", ca);addButton("/", ca);
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");//windowClass���
            SwingUtilities.updateComponentTreeUI(jFrame);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
   }
	
    private void addButton(String buttonName, ActionListener al) {
        JButton jb = new JButton(buttonName);
        jp.add(jb);//��Ӱ�ť
        jb.addActionListener(al);//���������¼��밴ťƥ��
    }
    
    // ���ּ�����
    private class NumberAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton jb = (JButton) e.getSource(); // ��ȡ�¼�Դ����
            String input = jb.getText(); // ��ȡ�¼�Դ�����ϵı�ǩ
            if (start) { // �״�����
                // һ�Ͼ�".",��ʲôҲ����
                if (input.equals(".")) {
                    return;
                }
                // �����"0.0"�Ļ�,�����
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
    }

    // �����������
    private class CommandAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton jb = (JButton) e.getSource(); // ��ȡ�¼�Դ����
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

    //����������¼���
	private void cleanActionPerformed(ActionEvent e) {
		 result = 0;
         start = true;
         flag = false;
         lastCommand = "=";
         display.setText("0.0");
		// TODO add your code here
	}
    
    
    //�Լ��޸��Լ���ϲ����ɵ�ҳ�棺
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
//	            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");//windowClass���
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

