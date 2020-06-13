package ch09.t09_03_01;

// ////////////////////////////////////////////////////////
// 
// J_Hello.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     同时是应用程序与小应用程序的简单例程。
// ////////////////////////////////////////////////////////


import java.awt.Graphics;
import javax.swing.JApplet;

public class J_Hello extends JApplet
{
    public void paint(Graphics g)
    { 
        g.clearRect(0, 0, getWidth( ), getHeight( )); // 清除背景
        g.drawString("您好!", 10, 20);
    } // 方法paint结束

    public static void main(String args[ ])
    {
        System.out.println("您好!");
    } // 方法main结束
} // 类J_Hello结束
