package ch07;

// ////////////////////////////////////////////////////////
// 
// J_EchoFile.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ��ȡ�ļ���test.txt�����ݵ����̡�
// ////////////////////////////////////////////////////////


import java.io.FileInputStream;
import java.io.IOException;

public class J_EchoFile
{
    public static void main(String args[ ])
    {
        try
        {
            FileInputStream f =new FileInputStream("test.txt");
            int i;
            int b=f.read( );
            for (i=0; b!=-1; i++)
            {
                System.out.print((char)b);
                b=f.read( );
            } // forѭ������
            System.out.println( );
            System.out.println("�ļ�\"test.txt\"�ֽ���Ϊ"+i);
            f.close( );
        }
        catch (IOException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_EchoFile����
