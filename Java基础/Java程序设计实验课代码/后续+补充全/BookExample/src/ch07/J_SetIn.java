package ch07;

// ////////////////////////////////////////////////////////
// 
// J_SetIn.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     �ض������̡�
// ////////////////////////////////////////////////////////


import java.io.FileInputStream;

public class J_SetIn
{
    public static void main(String args[ ])
    {
        try
        {
            System.setIn(new FileInputStream("test.txt"));
            J_Echo.mb_echo(System.in);
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_SetIn����
