package ex12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @content:
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月11日上午11:55:51
 * @第一次修改的时间：
 * @time:2020年6月18日上午10:45:56
 * @修改原因：课堂测验，修改内容：增加下拉框
 */
public class calculate extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	//添加文本区域：
	JTextField inputOne=new JTextField(5);
    JTextField inputTwo=new JTextField(5);
    JTextField output=new JTextField(5);
    //定义计算按钮
    JButton equal=new JButton("=");
    //定义下拉选项卡
    JComboBox<?> oper;
public calculate()
    {
            super("加减乘除运算游戏！！");
            Container container=getContentPane();//获取容器
            container.setLayout(new FlowLayout());//流式布局
            String operater[]={"+","-","*","/"};
            oper=new JComboBox<>(operater);//添加下拉选项
            //填充组件：
            container.add(inputOne);
            container.add(oper);
            container.add(inputTwo);
            container.add(equal);
            container.add(output);
            inputOne.addActionListener(this);
            inputTwo.addActionListener(this);
            equal.addActionListener(this);
//            设置显示
            setSize(400,100);
            setVisible(true);
            setLocationRelativeTo(getOwner());
        
    }

    public void actionPerformed(ActionEvent e)//处理函数，事件监听器
    {
        double first,second,sum=0;
        String v;
        v=(String) oper.getSelectedItem();//获取下拉框的值，并比较
        first=Double.parseDouble(inputOne.getText());//获取数据inputOne里的数据
        second=Double.parseDouble(inputTwo.getText());//通过getText()这个函数方法来获得
        if(v.equals("+"))
        sum=(float)(first+second);
        else if(v.equals("-"))
            sum=(float)(first-second);
        else if(v.equals("*"))
            sum=(float)(first*second);
        else if(v.equals("/"))
            sum=(float)(first/second);
            output.setText(String.valueOf(sum));//通过setText（）来打印结果
    }
    
public static void main(String args[])
    {
	new calculate().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
