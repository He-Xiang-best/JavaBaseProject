package ch06;

// ////////////////////////////////////////////////////////
// 
// J_ExceptionNewExample.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     自定义异常例程。
// ////////////////////////////////////////////////////////

class J_ExceptionNew extends Exception
{
    private static int m_number = 0;

    public J_ExceptionNew( )
    {
        m_number ++;
    } // J_ExceptionNew构造方法结束

    public String toString( )
    {
        return("新异常出现" + m_number + "次");
    } // 方法toString结束
} // 类J_ExceptionNew结束

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
        } // try-catch结构结束
    } // 方法main结束
} // 类J_ExceptionNewExample结束
