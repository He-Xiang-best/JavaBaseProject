package ch08;

// ////////////////////////////////////////////////////////
// 
// J_Button2.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ����ʽ��ť���䶯���¼��������̡�
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
        super( "�����¼�����" );
        b = new JButton("����0��");
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
                    b.setText("����" + (++m_count) + "��");
                    label.setText("aaaa");
                } // ����actionPerformed����
            } // ʵ�ֽӿ�ActionListener���ڲ������
        ); // addActionListener�������ý���

        c.add(b, BorderLayout.CENTER);
    } // J_Button2���췽������

    public static void main(String args[ ])
    {
        J_Button2 app = new J_Button2( );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 100, 80 );
        app.setVisible( true );
    } // ����main����
} // ��J_Button2����