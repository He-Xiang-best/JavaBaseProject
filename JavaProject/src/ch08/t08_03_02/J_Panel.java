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
                    Vector<Point> v= new Vector<Point>( ); // �µıʻ�
                    v.add(p); // ��ӱʻ������
                    m_vectorSet.add(v);
                } // ����mousePressed����
            } // ʵ�ֳ�����MouseAdapter���ڲ��������
        ); // addMouseListener�������ý���
        addMouseMotionListener( new MouseMotionAdapter( )
            {
                public void mouseDragged(MouseEvent e) 
                {
                    Point p= new Point(e.getX( ), e.getY( ));
                    int n= m_vectorSet.size( )-1;
                    Vector<Point> v= m_vectorSet.get(n);
                    v.add(p); // ��ӱʻ����м����յ�
                    repaint( );
                } // ����mouseDragged����
            } // ʵ�ֳ�����MouseMotionAdapter���ڲ��������
        ); // addMouseMotionListener�������ý���
    } // J_Panel���췽������

    protected void paintComponent(Graphics g)
    {
        g.clearRect(0 , 0, getWidth( ), getHeight( )); // �������
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
            } // �ڲ�forѭ������
        } // �ⲿforѭ������
    } // ����paintComponent����

    public Dimension getPreferredSize( )
    {
        return new Dimension( 500, 500 );
    } // ����getPreferredSize����
} // ��J_Panel����
