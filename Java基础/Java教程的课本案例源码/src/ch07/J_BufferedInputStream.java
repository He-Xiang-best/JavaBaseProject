package ch07;

// ////////////////////////////////////////////////////////
// 
// J_BufferedInputStream.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     带与不带缓存在读取数据时的效率比较例程。
// ////////////////////////////////////////////////////////


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Date;

public class J_BufferedInputStream
{
    private static String m_fileName = "bin\\ch08\\J_PopupMenu.class";

    public static void main(String args[ ])
    {
        try
        {
            int i, ch;
            i = 0;
            Date d1= new Date( );
            FileInputStream f = new FileInputStream(m_fileName);
            while ((ch=f.read( )) != -1) // read entire file
                i++;
            f.close( );
            Date d2= new Date( );

            long t = d2.getTime( ) - d1.getTime( ); // 单位(毫秒)
            System.out.printf("读取文件%1$s(共%2$d字节)%n",
                m_fileName, i);
            System.out.printf("不带缓存的方法需要%1$d毫秒%n", t);

            i = 0;
            d1= new Date( );
            f = new FileInputStream(m_fileName);
            BufferedInputStream fb = new BufferedInputStream(f);
            while ((ch=fb.read( )) != -1) // read entire file
                i++;
            fb.close( );
            d2= new Date( );
            
            t = d2.getTime( ) - d1.getTime( ); // 单位(毫秒)
            System.out.printf("带缓存的方法需要%1$d毫秒%n", t);
        }
        catch (Exception e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_BufferedInputStream结束
