package ch09.t09_02_05;

// ////////////////////////////////////////////////////////
// 
// J_Applet.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     СӦ�ó���������̡�
// ////////////////////////////////////////////////////////


import java.awt.Graphics;
import javax.swing.JApplet;

public class J_Applet extends JApplet
{
    public void paint(Graphics g)
    {
        g.clearRect(0, 0, getWidth( ), getHeight( )); // �������
        String s= getParameter("ʾ����");
        g.drawString("ʾ������ֵΪ" + s, 10, 20);
    } // ����paint����
} // ��J_Applet����
