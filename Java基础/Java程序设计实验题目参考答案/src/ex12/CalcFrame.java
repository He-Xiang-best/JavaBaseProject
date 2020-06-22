package ex12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalcFrame extends JFrame implements ActionListener{
    
	//计算器上键的名字
	private String[] buttons={"1","2","3","+","4","5","6","-","7","8","9","*","0",".","=","/"};
	//计算器的按钮
	private JButton[] jbs=new JButton[buttons.length];
	//计算器上显示结果的文本框
	private JTextField resultText=new JTextField("0.",18);
	//计算器的清零按钮
	private JButton jbend=new JButton("CE/C");
	
	// 标志用户按的是否是表达式的首个数字,或者是运算符后的首个数字
    private boolean firstDigit = true;
    //标记“-”是运算符还是负号
    private boolean negative=true;
    // 计算的中间结果。
    private double result = 0.0;
    // 当前运算的运算符
    private String operator = "=";
    // 操作是否合法
    private boolean opValid = true;

	/**
	 * 构造函数，主要用于构建一个计算器界面视图
	 */
	public CalcFrame(){
		super( "我的计算器" );
		init();
		
	}
	/**
     * 初始化计算器
     */
	public void init(){
		Container c = this.getContentPane( );
		c.setLayout(new FlowLayout());
		Font font=new Font("宋体",Font.BOLD,20);
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
      
       //添加编辑文本框
        resultText.setPreferredSize(new Dimension(160,50));
        resultText.setBackground(Color.white);
        resultText.setEnabled(false);
        resultText.setHorizontalAlignment(JTextField.RIGHT);
        resultText.setFont(font);
        p[0].add(resultText);
        
        //添加按钮到计算器中
        for (int i=0; i<jbs.length; i++)
        {
            jbs[i]=new JButton(buttons[i]);
            jbs[i].setPreferredSize(new Dimension(50,45));
            p[1].add(jbs[i]);
            jbs[i].addActionListener(this);
        } // for循环结束

        //添加清零按钮到计算器中
        jbend.setPreferredSize(new Dimension(200,40));
        p[2].add(jbend);
        jbend.addActionListener(this);
	}

	//事件处理方法，根据事件来源不同进行相应的处理
	public void actionPerformed(ActionEvent e) {
		/// 获取事件源的标签
        String label = e.getActionCommand();
        if (label.equals("CE/C")) {
            // 用户按了"CE/C"清零键
           handleCE();
        }  else if ("0123456789.".indexOf(label) >= 0) {
            // 用户按了数字键或者小数点键
            handleNumber(label);
        } else {
            // 用户按了运算符键
            handleOperator(label);
        }
	}
	 /**
     * 处理C或CE键被按下的事件
     */
    private void handleCE() {
        // 初始化计算器的各种值
        resultText.setText("0");
        firstDigit = true;
        operator = "=";
        negative=true;
    }
    /**
     * 处理数字键被按下的事件
     */
    private void handleNumber(String key) {
    	 if (firstDigit) {
             // 输入的第一个数字
             resultText.setText(key);
         } else if ((key.equals(".")) && (resultText.getText().indexOf(".") < 0)) {
             // 输入的是小数点，并且之前没有小数点，则将小数点附在结果文本框的后面
             resultText.setText(resultText.getText() + ".");
         } else if (!key.equals(".")) {
             // 如果输入的不是小数点，则将数字附在结果文本框的后面
             resultText.setText(resultText.getText() + key);
         }
         // 以后输入的肯定不是第一个数字了
         firstDigit = false;  
    }
    /**
     * 处理运算符键被按下的事件
     *
     * @param key
     */
    private void handleOperator(String key) {
        if (operator.equals("/")) {
            // 除法运算
            // 如果当前结果文本框中的值等于0
            if (getNumberFromText() == 0.0) {
                // 操作不合法
                opValid = false;
                resultText.setText("除数不能为零");
            } else {
                result /= getNumberFromText();
            }
        }  else if (operator.equals("+")) {
            // 加法运算
            result += getNumberFromText();
        } else if (operator.equals("-")) {
        	//第一次输入的是-号
        	if (negative){ 
        		System.out.println("----");
        		resultText.setText("-");
        		firstDigit=false;
          	}
        	else
            // 减法运算
            result -= getNumberFromText();
        } else if (operator.equals("*")) {
            // 乘法运算
            result *= getNumberFromText();
        }  else if (operator.equals("=")) {
            // 赋值运算
            result = getNumberFromText();
        }
        if (opValid) {
            // 双精度浮点数的运算
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
        // 运算符等于用户按的按钮
        operator = key;
        firstDigit = true;
        opValid = true;
        negative=false;
    }
 
    /**
     * 从结果文本框中获取数字
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
