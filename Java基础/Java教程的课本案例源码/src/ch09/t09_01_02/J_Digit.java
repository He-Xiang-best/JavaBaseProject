package ch09.t09_01_02;

// ////////////////////////////////////////////////////////
// 
// J_Digit.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     СӦ�ó���ͼ���û��������̡����������֡�
// ////////////////////////////////////////////////////////

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;

public class J_Digit extends JApplet implements ActionListener
{
    private JTextField m_textField= new JTextField( );

    public void init( )
    {
        Container c = getContentPane( );
        JButton b;
        String [ ] s= {BorderLayout.SOUTH, BorderLayout.EAST,
                      BorderLayout.NORTH, BorderLayout.WEST};
        for (int i=0; i<4; i++)
        {
            b= new JButton(""+i);
            c.add(b, s[i]);
            b.addActionListener(this);
        } // forѭ������
        c.add(m_textField, BorderLayout.CENTER);
    } // ����init����

    public void actionPerformed(ActionEvent e)
    {
        String s= m_textField.getText( )+e.getActionCommand( );
        m_textField.setText(s);
    } // ����actionPerformed����
} // ��J_Digit����
