package ch08;

// ////////////////////////////////////////////////////////
// 
// J_BorderLayout.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     �߽粼�ֹ��������̡�
// ////////////////////////////////////////////////////////



import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_BorderLayout
{
    public static void main(String args[ ])
    {
        JFrame app = new JFrame( "�߽粼�ֹ���������" );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 360, 130 );
        Container c = app.getContentPane( );
        c.setLayout( new BorderLayout( ) ); // ��������ɾȥ
        c.add(new JButton("��"), BorderLayout.EAST);
        c.add(new JButton("��"), BorderLayout.WEST);
        c.add(new JButton("��"), BorderLayout.SOUTH);
        c.add(new JButton("��"), BorderLayout.NORTH);
        c.add(new JButton("��"), BorderLayout.CENTER);
        app.setVisible( true );
    } // ����main����
} // ��J_BorderLayout����
