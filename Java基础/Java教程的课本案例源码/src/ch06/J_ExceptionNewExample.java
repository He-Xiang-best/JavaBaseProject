package ch06;

// ////////////////////////////////////////////////////////
// 
// J_ExceptionNewExample.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     �Զ����쳣���̡�
// ////////////////////////////////////////////////////////

class J_ExceptionNew extends Exception
{
    private static int m_number = 0;

    public J_ExceptionNew( )
    {
        m_number ++;
    } // J_ExceptionNew���췽������

    public String toString( )
    {
        return("���쳣����" + m_number + "��");
    } // ����toString����
} // ��J_ExceptionNew����

public class J_ExceptionNewExample
{
    public static void main(String args[ ])
    {
        try
        {
            throw new J_ExceptionNew( );
        }
        catch(J_ExceptionNew e)
        {
            System.err.println(e);
        } // try-catch�ṹ����
    } // ����main����
} // ��J_ExceptionNewExample����
