package ch07;

// ////////////////////////////////////////////////////////
// 
// J_WriteFile.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     �ļ���������̡�
// ////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.io.IOException;

public class J_WriteFile
{
    public static void main(String args[ ])
    {
        String s = "�ļ�dddd��";
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
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_WriteFile����