package ch07;

// ////////////////////////////////////////////////////////
// 
// J_Data.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ����������(DataInputStream)��
//     ���������(DataOutputStream)���̡�
// ////////////////////////////////////////////////////////


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J_Data
{
    public static void main(String args[ ])
    {
        try
        {

            FileOutputStream fout = new FileOutputStream("E:\\out.txt");
            DataOutputStream dfout =new DataOutputStream(fout);
            int i;
            for (i=0; i< 4; i++)
                dfout.writeInt('0' + i);
            dfout.close( );

            FileInputStream fin= new FileInputStream("E:\\out.txt");
            DataInputStream dfin= new DataInputStream(fin);
            for (i=0; i< 4; i++)
                System.out.print(dfin.readInt( ) + ", ");
            dfin.close( );
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_Data����
