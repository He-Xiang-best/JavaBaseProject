package ch09.t09_01_03;

// ////////////////////////////////////////////////////////
// 
// J_SystemApplet.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ϵͳ������Ϣ��ʾСӦ�ó������̡�
// ////////////////////////////////////////////////////////


import java.awt.Graphics;
import javax.swing.JApplet;

public class J_SystemApplet extends JApplet
{
    public void paint(Graphics g)
    {
        String s[ ] = {"file.separator", "java.class.version",
            "java.specification.name", "java.specification.vendor",
            "java.specification.version", "java.vendor",
            "java.vendor.url", "java.version", "java.vm.name",
            "java.vm.specification.name",
            "java.vm.specification.vendor",
            "java.vm.specification.version",
            "java.vm.vendor", "java.vm.version", "line.separator",
            "os.arch", "os.name", "os.version", "path.separator",
            "java.class.path", "java.compiler", "java.ext.dirs",
            "java.home", "java.io.tmpdir", "java.library.path",
            "user.dir", "user.home", "user.name"};
        String r;
        g.clearRect(0, 0, getWidth( ), getHeight( )); // �������
        for (int i=0; i<s.length; i++)
        {
            try
            {
                r = System.getProperty(s[i]);
            }
            catch (Exception e)
            {
                r = "�����쳣" + e;
            } // try-catch�ṹ����
            g.drawString(s[i] + ": " + r, 20, i*15+20);
        } // forѭ������
    } // ����paint����
} // ��J_SystemApplet����
