package ch06;

// ////////////////////////////////////////////////////////
// 
// J_ExceptionCatch.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     �쳣��׽���̡�
// ////////////////////////////////////////////////////////

public class J_ExceptionCatch
{
    public static void main(String args[ ])
    {
        try
        {
            System.out.println("try����");
            throw new Exception( );
        }
        catch(Exception e)
        {
            System.err.println("catch����");
            e.printStackTrace( );
        }
        finally
        {
            System.out.println("finally����");
        } // try-catch-finally�ṹ����
    } // ����main����
} // ��J_ExceptionCatch����
