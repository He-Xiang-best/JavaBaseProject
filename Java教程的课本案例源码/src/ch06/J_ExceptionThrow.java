package ch06;

// ////////////////////////////////////////////////////////
// 
// J_Exception.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     异常处理例程。
// ////////////////////////////////////////////////////////


public class J_ExceptionThrow
{
    public static void mb_throwException( )
    {
        System.out.println("产生并抛出ArithmeticException类型的异常");
        throw new ArithmeticException( );
    } // 方法mb_throwException结束

    public static void mb_catchArrayException( ) //throws Exception
    {
    	try{
        mb_throwException();
    	}catch(ArrayIndexOutOfBoundsException e){System.out.println("调用方法异常"+e);}
    	finally{}
        System.out.println("方法mb_catchArrayException运行结束"); 
    } // 方法mb_catchArrayException结束

    public static void main(String args[ ])//throws Exception 
    {
    	try{
            mb_catchArrayException();
    	}catch (Exception e){
    		System.err.println("主方法的异常"+e);
    	}
    	finally{
    		System.out.println("main语句的finally语句块");
    	}
        System.out.println("异常处理结束"); 
    } // 方法main结束
} // 类J_Exception结束
