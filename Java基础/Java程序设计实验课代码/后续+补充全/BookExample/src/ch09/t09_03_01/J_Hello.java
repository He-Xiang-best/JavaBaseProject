package ch09.t09_03_01;

// ////////////////////////////////////////////////////////
// 
// J_Hello.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ͬʱ��Ӧ�ó�����СӦ�ó���ļ����̡�
// ////////////////////////////////////////////////////////


import java.awt.Graphics;
import javax.swing.JApplet;

public class J_Hello extends JApplet
{
    public void paint(Graphics g)
    { 
        g.clearRect(0, 0, getWidth( ), getHeight( )); // �������
        g.drawString("����!", 10, 20);
    } // ����paint����

    public static void main(String args[ ])
    {
        System.out.println("����!");
    } // ����main����
} // ��J_Hello����
