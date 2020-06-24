package ch06;

// ////////////////////////////////////////////////////////
// 
// J_ExceptionCatch.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     异常捕捉例程。
// ////////////////////////////////////////////////////////

public class J_ExceptionCatch
{
    public static void main(String args[ ])
    {
        try
        {
            System.out.println("try语句块");
            throw new Exception( );
        }
        catch(Exception e)
        {
            System.err.println("catch语句块");
            e.printStackTrace( );
        }
        finally
        {
            System.out.println("finally语句块");
        } // try-catch-finally结构结束
    } // 方法main结束
} // 类J_ExceptionCatch结束
