package ch09.t09_01_01;

// ////////////////////////////////////////////////////////
// 
// J_PrintState.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     СӦ�ó����������ڵ���֤���̡�
// ////////////////////////////////////////////////////////


import java.awt.Graphics;
import javax.swing.JApplet;

public class J_PrintState extends JApplet
{
    public void init( )
    {
        System.out.println("init: ��ʼ��");
    } // ����init����

    public void start( )
    { 
        System.out.println("start: ����");
    } // ����start����

    public void paint(Graphics g)
    {
        g.clearRect(0, 0, getWidth( ), getHeight( )); // ���Ʊ���
        g.drawString("��֤СӦ�ó������������", 20, 40);
        System.out.println("paint: ����");
    } // ����paint����

    public void stop( )
    { 
        System.out.println("stop: ֹͣ");
    } // ����stop����

    public void destroy( )
    { 
        System.out.println("destroy: �ر�");
    } // ����destroy����
} // ��J_PrintState����
