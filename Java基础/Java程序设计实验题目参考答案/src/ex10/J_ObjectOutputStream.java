package ex10;

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
/**
 * ���ö������������������д���ļ�
 * @author ������
 *2017.5.17
 */
public class J_ObjectOutputStream
{
	/**
	 * ����������д���ļ�
	 * @param filename д���ļ����ļ���
	 * @param s д���ļ��Ķ�������
	 */


    public static void writeFile(String filename,J_Student[] s)
    {
        try
        {
            ObjectOutputStream f = new ObjectOutputStream(
                new FileOutputStream(filename,true));
             for (J_Student st:s)
            	f.writeObject(st);
              f.close( );
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����writeFile����
} // ��J_ObjectOutputStream����
