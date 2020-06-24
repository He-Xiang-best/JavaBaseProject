package ch07;

// ////////////////////////////////////////////////////////
// 
// J_RandomAccessFile.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     随机访问文件例程。
// ////////////////////////////////////////////////////////


import java.io.IOException;
import java.io.RandomAccessFile;

public class J_RandomAccessFile
{
    public static void main(String args[ ])
    {
        try
        {
            RandomAccessFile f=new RandomAccessFile("test.txt", "rw");
            int     i;
            double  d;
            for (i=0; i<10; i++)
                f.writeDouble(Math.PI*i);
            f.seek(16);
            f.writeDouble(0);
            f.seek(0);
            for (i=0; i < 10; i++)
            {
                d=f.readDouble( );
                System.out.println("[" + i + "]: " + d);
            } // for循环结束
            f.close( );
        }
        catch (IOException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_RandomAccessFile结束
