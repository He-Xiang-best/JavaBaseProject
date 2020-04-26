package ch07;

// ////////////////////////////////////////////////////////
// 
// J_PrintStream.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     PrintStream���̡�
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
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_PrintStream����
