package ch08;

// ////////////////////////////////////////////////////////
// 
// J_FrameDialog.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     在对话框中添加标签的例程。
// ////////////////////////////////////////////////////////


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J_FrameDialog
{
    public static void main(String args[ ])
    {
        JFrame app = new JFrame( "框架" );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 200, 100 );
        app.setVisible( true );

        JDialog d = new JDialog(app, "对话框", false);
        Container c = d.getContentPane( );
        c.setLayout( new FlowLayout(FlowLayout.LEFT) );
        c.add(new JLabel("您好"));
        d.setSize( 80, 80 );
        d.setVisible(true);
    } // 方法main结束
} // 类J_FrameDialog结束
