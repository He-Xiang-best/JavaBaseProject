package ch08;

// ////////////////////////////////////////////////////////
// 
// J_Draw.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ���ֻ����̡�
// ////////////////////////////////////////////////////////


import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class J_Draw extends JFrame
{
    public J_Draw( )
    {
        super( "���ֻ�����" );
        Container c = getContentPane( );
        c.add( new J_Panel( ),  BorderLayout.CENTER);
    } // J_Draw���췽������

    public static void main(String args[ ])
    {
        J_Draw app = new J_Draw( );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 270, 150 );
        app.setVisible( true );
    } // ����main����
} // ��J_Draw����
