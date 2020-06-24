package ch08;

// ////////////////////////////////////////////////////////
// 
// J_Button2.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     命令式按钮及其动作事件处理例程。
// ////////////////////////////////////////////////////////



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J_Button2 extends JFrame
{
	JLabel label;
	JButton b;
	public J_Button2( )
    {
        super( "动作事件例程" );
        b = new JButton("单击0次");
        Container c = getContentPane( );
        label=new JLabel("tttt");
        /*J_ActionListener a = new J_ActionListener( );
        b.addActionListener(a);*/
        b.addActionListener(new ActionListener( )
            {
                int m_count = 0;
            
                public void actionPerformed(ActionEvent e)
                {
                    //JButton b= (JButton)e.getSource( );
                    b.setText("单击" + (++m_count) + "次");
                    label.setText("aaaa");
                } // 方法actionPerformed结束
            } // 实现接口ActionListener的内部类结束
        ); // addActionListener方法调用结束

        c.add(b, BorderLayout.CENTER);
    } // J_Button2构造方法结束

    public static void main(String args[ ])
    {
        J_Button2 app = new J_Button2( );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 100, 80 );
        app.setVisible( true );
    } // 方法main结束
} // 类J_Button2结束
