package ch07;

// ////////////////////////////////////////////////////////
// 
// J_WriteFile.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     文件输出流例程。
// ////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.io.IOException;

public class J_WriteFile
{
    public static void main(String args[ ])
    {
        String s = "文件dddd程";
        byte[ ] b = s.getBytes( );
        try
        {
            FileOutputStream f = new FileOutputStream("out.txt");
            f.write(b);
            f.flush( );
            f.close( );
        }
        catch (IOException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_WriteFile结束
