package ch06;

// ////////////////////////////////////////////////////////
// 
// J_ExceptionByZeroThrows.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     除数为0的异常抛出例程。
// ////////////////////////////////////////////////////////


public class J_ExceptionByZeroThrows
{
	public int computer(int a,int b) throws ArithmeticException,NumberFormatException
	{
		int c=a/b;
		return c;
	}
	
    public static void main(String args[ ]) throws Exception
    {
        int a= 10;
        int b = 0;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        J_ExceptionByZeroThrows mythrows=new J_ExceptionByZeroThrows();
        //try{
             int c=mythrows.computer(a,b);
        /*}catch (Exception e){
        	System.err.print(e);
        }*/
        
        //System.out.println("a/b=" + J_ExceptionByZeroThrows.computer(a/b));
    } // 方法main结束
} // 类J_ExceptionByZero结束
