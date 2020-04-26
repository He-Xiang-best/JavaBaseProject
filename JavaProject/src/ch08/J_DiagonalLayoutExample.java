package ch08;

// ////////////////////////////////////////////////////////
// 
// J_DiagonalLayoutExample.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     自定义对角线布局管理器应用例程。
// ////////////////////////////////////////////////////////



import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_DiagonalLayoutExample
{
    public static void main(String args[ ])
    {
        JFrame app = new JFrame( "自定义对角线布局管理器应用例程" );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 300, 200 );
        Container c = app.getContentPane( );
        c.setLayout( new J_DiagonalLayout( ) );
        String s;
        JButton b;
        for (int i=0; i<5; i++)
        {
            s = "按钮" + (i+1);
            b = new JButton( s );
            c.add( b );
        } // for循环结束
        app.setVisible( true );
    } // 方法main结束
} // 类J_DiagonalLayoutExample结束
