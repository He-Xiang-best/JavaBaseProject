package ex12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalcFrame extends JFrame implements ActionListener{
    
	//�������ϼ�������
	private String[] buttons={"1","2","3","+","4","5","6","-","7","8","9","*","0",".","=","/"};
	//�������İ�ť
	private JButton[] jbs=new JButton[buttons.length];
	//����������ʾ������ı���
	private JTextField resultText=new JTextField("0.",18);
	//�����������㰴ť
	private JButton jbend=new JButton("CE/C");
	
	// ��־�û������Ƿ��Ǳ��ʽ���׸�����,���������������׸�����
    private boolean firstDigit = true;
    //��ǡ�-������������Ǹ���
    private boolean negative=true;
    // ������м�����
    private double result = 0.0;
    // ��ǰ����������
    private String operator = "=";
    // �����Ƿ�Ϸ�
    private boolean opValid = true;

	/**
	 * ���캯������Ҫ���ڹ���һ��������������ͼ
	 */
	public CalcFrame(){
		super( "�ҵļ�����" );
		init();
		
	}
	/**
     * ��ʼ��������
     */
	public void init(){
		Container c = this.getContentPane( );
		c.setLayout(new FlowLayout());
		Font font=new Font("����",Font.BOLD,20);
        JPanel [ ] p = new JPanel[3];     
        for (int i=0; i<3; i++)
        {
            p[i]= new JPanel( );
            c.add(p[i]);
            if (i==0)
            	 p[i].setLayout(new FlowLayout());
            else if(i==1)
            	p[i].setLayout(new GridLayout(4,5));
            else
            	  p[i].setLayout(new FlowLayout());
        }
      
       //��ӱ༭�ı���
        resultText.setPreferredSize(new Dimension(160,50));
        resultText.setBackground(Color.white);
        resultText.setEnabled(false);
        resultText.setHorizontalAlignment(JTextField.RIGHT);
        resultText.setFont(font);
        p[0].add(resultText);
        
        //��Ӱ�ť����������
        for (int i=0; i<jbs.length; i++)
        {
            jbs[i]=new JButton(buttons[i]);
            jbs[i].setPreferredSize(new Dimension(50,45));
            p[1].add(jbs[i]);
            jbs[i].addActionListener(this);
        } // forѭ������

        //������㰴ť����������
        jbend.setPreferredSize(new Dimension(200,40));
        p[2].add(jbend);
        jbend.addActionListener(this);
	}

	//�¼��������������¼���Դ��ͬ������Ӧ�Ĵ���
	public void actionPerformed(ActionEvent e) {
		/// ��ȡ�¼�Դ�ı�ǩ
        String label = e.getActionCommand();
        if (label.equals("CE/C")) {
            // �û�����"CE/C"�����
           handleCE();
        }  else if ("0123456789.".indexOf(label) >= 0) {
            // �û��������ּ�����С�����
            handleNumber(label);
        } else {
            // �û������������
            handleOperator(label);
        }
	}
	 /**
     * ����C��CE�������µ��¼�
     */
    private void handleCE() {
        // ��ʼ���������ĸ���ֵ
        resultText.setText("0");
        firstDigit = true;
        operator = "=";
        negative=true;
    }
    /**
     * �������ּ������µ��¼�
     */
    private void handleNumber(String key) {
    	 if (firstDigit) {
             // ����ĵ�һ������
             resultText.setText(key);
         } else if ((key.equals(".")) && (resultText.getText().indexOf(".") < 0)) {
             // �������С���㣬����֮ǰû��С���㣬��С���㸽�ڽ���ı���ĺ���
             resultText.setText(resultText.getText() + ".");
         } else if (!key.equals(".")) {
             // �������Ĳ���С���㣬�����ָ��ڽ���ı���ĺ���
             resultText.setText(resultText.getText() + key);
         }
         // �Ժ�����Ŀ϶����ǵ�һ��������
         firstDigit = false;  
    }
    /**
     * ����������������µ��¼�
     *
     * @param key
     */
    private void handleOperator(String key) {
        if (operator.equals("/")) {
            // ��������
            // �����ǰ����ı����е�ֵ����0
            if (getNumberFromText() == 0.0) {
                // �������Ϸ�
                opValid = false;
                resultText.setText("��������Ϊ��");
            } else {
                result /= getNumberFromText();
            }
        }  else if (operator.equals("+")) {
            // �ӷ�����
            result += getNumberFromText();
        } else if (operator.equals("-")) {
        	//��һ���������-��
        	if (negative){ 
        		System.out.println("----");
        		resultText.setText("-");
        		firstDigit=false;
          	}
        	else
            // ��������
            result -= getNumberFromText();
        } else if (operator.equals("*")) {
            // �˷�����
            result *= getNumberFromText();
        }  else if (operator.equals("=")) {
            // ��ֵ����
            result = getNumberFromText();
        }
        if (opValid) {
            // ˫���ȸ�����������
            long t1;
            double t2;
            t1 = (long) result;
            t2 = result - t1;
            if (t2 == 0) {
                resultText.setText(String.valueOf(t1));
            } else {
                resultText.setText(String.valueOf(result));
            }
        }
        // ����������û����İ�ť
        operator = key;
        firstDigit = true;
        opValid = true;
        negative=false;
    }
 
    /**
     * �ӽ���ı����л�ȡ����
     * @return
     */
    private double getNumberFromText() {
        double result = 0;
        try {
            result = Double.valueOf(resultText.getText()).doubleValue();
        } catch (NumberFormatException e) {
        }
        return result;
    }



}
