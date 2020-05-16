package ch09.t09_02_05;

// ////////////////////////////////////////////////////////
// 
// J_Applet.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     小应用程序参数例程。
// ////////////////////////////////////////////////////////


import java.awt.Graphics;
import javax.swing.JApplet;

public class J_Applet extends JApplet
{
    public void paint(Graphics g)
    {
        g.clearRect(0, 0, getWidth( ), getHeight( )); // 清除背景
        String s= getParameter("示例名");
        g.drawString("示例名的值为" + s, 10, 20);
    } // 方法paint结束
} // 类J_Applet结束
