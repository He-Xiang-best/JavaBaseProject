package ch08;

// ////////////////////////////////////////////////////////
// 
// J_Button1.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ����ʽ��ť���䶯���¼��������̡�
// ////////////////////////////////////////////////////////



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class J_ActionListener implements ActionListener{
    int m_count = 0;
    public void actionPerformed(ActionEvent e)    {
        JButton b= (JButton)e.getSource( );
        b.setText("����" + (++m_count) + "��");
        //b.setBackground(Color.BLUE);
    } // ����actionPerformed����
} // ��J_ActionListener����

public class J_Button1 extends JFrame{
    public J_Button1( )   {
        super( "�����¼�����" );
        Container c = getContentPane( );
        JButton b = new JButton("����0��");
        JLabel label=new JLabel("tttt");
        c.add(b, BorderLayout.CENTER); 
        
        ActionListener a = new J_ActionListener( );
        b.addActionListener(a);
    } // J_Button1���췽������

    public static void main(String args[ ])
    {
        J_Button1 app = new J_Button1( );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 100, 80 );
        app.setVisible( true );
    } // ����main����
} // ��J_Button1����
