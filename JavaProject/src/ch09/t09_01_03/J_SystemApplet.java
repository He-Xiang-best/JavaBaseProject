package ch09.t09_01_03;

// ////////////////////////////////////////////////////////
// 
// J_SystemApplet.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     系统属性信息显示小应用程序例程。
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
        g.clearRect(0, 0, getWidth( ), getHeight( )); // 清除背景
        for (int i=0; i<s.length; i++)
        {
            try
            {
                r = System.getProperty(s[i]);
            }
            catch (Exception e)
            {
                r = "出现异常" + e;
            } // try-catch结构结束
            g.drawString(s[i] + ": " + r, 20, i*15+20);
        } // for循环结束
    } // 方法paint结束
} // 类J_SystemApplet结束
