package ch08.t08_03_02;

// ////////////////////////////////////////////////////////
// 
// J_Panel.java
// 
// ////////////////////////////////////////////////////////


import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Vector;

import javax.swing.JPanel;

public class J_Panel extends JPanel
{
    private Vector<Vector<Point>> m_vectorSet
        = new Vector<Vector<Point>>( );

    public J_Panel( )
    {
    	//this.setBackground(Color.red);
        addMouseListener( new MouseAdapter( )
            {
                public void mousePressed(MouseEvent e)
                {
                    Point p= new Point(e.getX( ), e.getY( ));
                    Vector<Point> v= new Vector<Point>( ); // 新的笔划
                    v.add(p); // 添加笔划的起点
                    m_vectorSet.add(v);
                } // 方法mousePressed结束
            } // 实现抽象类MouseAdapter的内部子类结束
        ); // addMouseListener方法调用结束
        addMouseMotionListener( new MouseMotionAdapter( )
            {
                public void mouseDragged(MouseEvent e) 
                {
                    Point p= new Point(e.getX( ), e.getY( ));
                    int n= m_vectorSet.size( )-1;
                    Vector<Point> v= m_vectorSet.get(n);
                    v.add(p); // 添加笔划的中间点或终点
                    repaint( );
                } // 方法mouseDragged结束
            } // 实现抽象类MouseMotionAdapter的内部子类结束
        ); // addMouseMotionListener方法调用结束
    } // J_Panel构造方法结束

    protected void paintComponent(Graphics g)
    {
        g.clearRect(0 , 0, getWidth( ), getHeight( )); // 清除背景
        Vector<Point> v;
        Point s, t;
        int i, j, m;
        int n = m_vectorSet.size( );
        for (i=0; i<n; i++)
        {
            v = m_vectorSet.get(i);
            m = v.size( )-1;
            for (j=0; j<m; j++)
            {
                s = (Point)v.get(j);
                t = (Point)v.get(j+1);
                g.drawLine(s.x, s.y, t.x, t.y);
            } // 内部for循环结束
        } // 外部for循环结束
    } // 方法paintComponent结束

    public Dimension getPreferredSize( )
    {
        return new Dimension( 500, 500 );
    } // 方法getPreferredSize结束
} // 类J_Panel结束
