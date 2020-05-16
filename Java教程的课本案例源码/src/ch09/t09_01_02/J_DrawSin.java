package ch09.t09_01_02;

// ////////////////////////////////////////////////////////
// 
// J_DrawSin.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     �����������ߵ�СӦ�ó���ͼ���û��������̡�
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

        d= Math.PI/100; // �����߷ֳ�ΪԼ200��
        x0=y0=0;
        for (tx=0, x=20; tx <= 2*Math.PI; tx+=d, x++)
        { // ���߻���
            y= 120-(int)(Math.sin(tx)*50+60); // ���š�ƽ�ơ��Գ�
            if (x>20)
                g.drawLine(x0, y0, x, y); // �����߷ֳ�Ϊ�߶Σ�Ȼ����λ���
            x0= x;
            y0= y;
        } // forѭ������
        g.drawString("y=sin(x)", 10, 70);
    } // ����paintComponent����
} // ��J_Panel����

public class J_DrawSin extends JApplet
{
    public void init( )
    {
        Container c = getContentPane( );
        c.add(new J_Panel( ), BorderLayout.CENTER);
    } // ����init����
} // ��J_DrawSin����
