package ch07;

// ////////////////////////////////////////////////////////
// 
// J_PrintWriter.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     PrintWriter���̡�
// ////////////////////////////////////////////////////////

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class J_PrintWriter
{
    public static void main(String args[ ])
    {
        try
        {
            PrintWriter f = new PrintWriter("out.txt");
            f.println("Ī���У���������ͷ���ձ���");
            f.close( );
        }
        catch (FileNotFoundException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_PrintWriter����
