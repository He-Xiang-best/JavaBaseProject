package ch06;

// ////////////////////////////////////////////////////////
// 
// J_Exception.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     异常处理例程。
// ////////////////////////////////////////////////////////


public class J_Exception
{
    public static void mb_throwException( )
    {
        System.out.println("产生并抛出ArithmeticException类型的异常");
        throw new ArithmeticException( );
    } // 方法mb_throwException结束

    public static void mb_catchArrayException( )
    {
        try
        {
            mb_throwException( );
            System.out.println("在try语句块中的多余语句");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("方法mb_catchArrayException捕捉到异常");
        }
        finally
        {
            System.out.println(
                "方法mb_catchArrayException的finally语句块");
        } // try-catch-finally结构结束
        System.out.println("方法mb_catchArrayException运行结束"); 
    } // 方法mb_catchArrayException结束

    public static void main(String args[ ])
    {
        try
        {
            mb_catchArrayException( );
        }
        catch(ArithmeticException e)
        {
            System.err.println("方法main捕捉到异常");
        }
        finally
        {
            System.out.println("方法main的finally语句块");
        } // try-catch-finally结构结束
        System.out.println("异常处理结束"); 
    } // 方法main结束
} // 类J_Exception结束
