package ch07;

// ////////////////////////////////////////////////////////
// 
// J_PrintStream.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     PrintStream例程。
// ////////////////////////////////////////////////////////


import java.io.PrintStream;
import java.io.FileNotFoundException;

public class J_PrintStream
{
    public static void main(String args[ ])
    {
        try
        {
            PrintStream f = new PrintStream("hello.txt");
            f.printf("%1$d+%2$d=%3$d", 5, 8, (5+8));
            f.close( );
        }
        catch (FileNotFoundException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_PrintStream结束
