package ch08;

// ////////////////////////////////////////////////////////
// 
// J_DiagonalLayoutExample.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     �Զ���Խ��߲��ֹ�����Ӧ�����̡�
// ////////////////////////////////////////////////////////



import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_DiagonalLayoutExample
{
    public static void main(String args[ ])
    {
        JFrame app = new JFrame( "�Զ���Խ��߲��ֹ�����Ӧ������" );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 300, 200 );
        Container c = app.getContentPane( );
        c.setLayout( new J_DiagonalLayout( ) );
        String s;
        JButton b;
        for (int i=0; i<5; i++)
        {
            s = "��ť" + (i+1);
            b = new JButton( s );
            c.add( b );
        } // forѭ������
        app.setVisible( true );
    } // ����main����
} // ��J_DiagonalLayoutExample����
