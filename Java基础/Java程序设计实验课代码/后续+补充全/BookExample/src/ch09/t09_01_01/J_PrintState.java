package ch09.t09_01_01;

// ////////////////////////////////////////////////////////
// 
// J_PrintState.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     小应用程序生命周期的验证例程。
// ////////////////////////////////////////////////////////


import java.awt.Graphics;
import javax.swing.JApplet;

public class J_PrintState extends JApplet
{
    public void init( )
    {
        System.out.println("init: 初始化");
    } // 方法init结束

    public void start( )
    { 
        System.out.println("start: 启动");
    } // 方法start结束

    public void paint(Graphics g)
    {
        g.clearRect(0, 0, getWidth( ), getHeight( )); // 绘制背景
        g.drawString("验证小应用程序的生命周期", 20, 40);
        System.out.println("paint: 绘制");
    } // 方法paint结束

    public void stop( )
    { 
        System.out.println("stop: 停止");
    } // 方法stop结束

    public void destroy( )
    { 
        System.out.println("destroy: 关闭");
    } // 方法destroy结束
} // 类J_PrintState结束
