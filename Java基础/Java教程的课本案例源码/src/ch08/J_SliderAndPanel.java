package ch08;

// ////////////////////////////////////////////////////////
// 
// J_SliderAndPanel.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     滑动条和面板例程。
// ////////////////////////////////////////////////////////


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class J_SliderAndPanel
{
    public static void main(String args[ ])
    {
        JFrame app = new JFrame( "滑动条和面板例程" );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 360, 120 );
        Container c = app.getContentPane( );
        c.setLayout( new FlowLayout( ) );
        JSlider s = new JSlider(JSlider.HORIZONTAL, 0, 30, 10);
        JPanel p = new JPanel( );
        p.setPreferredSize( new Dimension(100, 60) );
        p.setBackground(Color.green);
        c.add( s );
        c.add( p );
        app.setVisible( true );
    } // 方法main结束
} // 类J_SliderAndPanel结束
