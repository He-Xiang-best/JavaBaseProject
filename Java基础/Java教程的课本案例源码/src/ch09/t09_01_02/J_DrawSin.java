package ch09.t09_01_02;

// ////////////////////////////////////////////////////////
// 
// J_DrawSin.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     绘制正弦曲线的小应用程序图形用户界面例程。
// ////////////////////////////////////////////////////////


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JPanel;

class J_Panel extends JPanel
{
    protected void paintComponent(Graphics g)
    {
        double d, tx;
        int    x, y, x0, y0;

        d= Math.PI/100; // 将曲线分成为约200段
        x0=y0=0;
        for (tx=0, x=20; tx <= 2*Math.PI; tx+=d, x++)
        { // 曲线绘制
            y= 120-(int)(Math.sin(tx)*50+60); // 缩放、平移、对称
            if (x>20)
                g.drawLine(x0, y0, x, y); // 将曲线分成为线段，然后逐段绘制
            x0= x;
            y0= y;
        } // for循环结束
        g.drawString("y=sin(x)", 10, 70);
    } // 方法paintComponent结束
} // 类J_Panel结束

public class J_DrawSin extends JApplet
{
    public void init( )
    {
        Container c = getContentPane( );
        c.add(new J_Panel( ), BorderLayout.CENTER);
    } // 方法init结束
} // 类J_DrawSin结束
