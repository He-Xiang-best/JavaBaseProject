package ch07.t07_04_01;

// ////////////////////////////////////////////////////////
// 
// J_ObjectOutputStream.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ����������̡�
// ////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class J_ObjectOutputStream
{
    public static void main(String args[ ])
    {
        try
        {
            ObjectOutputStream f = new ObjectOutputStream(
                new FileOutputStream("object1.dat"));
            J_Student s = new J_Student( "����zzzzz", 2003001, 172);
            f.writeObject(s);
            s.mb_output( );
            f.close( );
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_ObjectOutputStream����
