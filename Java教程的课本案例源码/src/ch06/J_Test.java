package ch06;

// ////////////////////////////////////////////////////////
// 
// J_Test.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     异常处理例程。
// ////////////////////////////////////////////////////////

public class J_Test
{
    public static void mb_createException( )
    {
        throw new ArrayIndexOutOfBoundsException( );
    } // 方法mb_createException结束

    public static void mb_method( )
    {
        try
        {
            mb_createException( );
            System.out.print("a");
        }
        catch (ArithmeticException  e)
        {
            System.err.print("b");
        }
        finally
        {
            System.out.print("c");
        } // try-catch-finally结构结束
        System.out.print("d");
    } // 方法mb_method结束

    public static void main(String args[ ])
    {
        try
        {
            mb_method( );
        }
        catch (Exception e)
        {
            System.err.print('m');
        } // try-catch结构结束
        System.out.print('n');
    } // 方法main结束
} // 类J_Test结束
