package ch07;

// ////////////////////////////////////////////////////////
// 
// J_FileReaderWriter.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     �ļ���д�����̡�
// ////////////////////////////////////////////////////////


import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class J_FileReaderWriter
{
    public static void main(String args[ ])
    {
        try
        {
            FileWriter f_out=  new FileWriter("test.txt");
            f_out.write("��־�ߣ��¾���\r\n");
            f_out.write("��дһ��\r\n");
            f_out.write("��־�ߣ��¾���\r\n");
            f_out.close( );

            FileReader f_in=  new FileReader("test.txt");
            for (int c=f_in.read( ); c!=-1; c=f_in.read( ))
                System.out.print((char)c);
            f_in.close( );
        }
        catch (IOException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_FileReaderWriter����