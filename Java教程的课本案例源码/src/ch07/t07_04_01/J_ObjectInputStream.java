package ch07.t07_04_01;

// ////////////////////////////////////////////////////////
// 
// J_ObjectInputStream.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ��ȡ�������̡�
// ////////////////////////////////////////////////////////


import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class J_ObjectInputStream
{
    public static void main(String args[ ])
    {
        try
        {
            ObjectInputStream f = new ObjectInputStream(
                new FileInputStream("object1.dat"));
           /* J_Student s = (J_Student)(f.readObject( ));
            s.mb_output( );*/
            Object s=f.readObject();
            System.out.print(s);
            f.close( );
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_ObjectInputStream����
