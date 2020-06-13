package ch06;

// ////////////////////////////////////////////////////////
// 
// J_ExceptionByZero.java
// ////////////////////////////////////////////////////////
// 简介:
//     除数为0的异常例程。
// ////////////////////////////////////////////////////////

public class J_ExceptionByZero
{
    
	public static void main (String args[])// throws ArithmeticException
    {
      
		int numberA= 10;
        int numberB = 0;
        System.out.println("a=" + numberA);
        System.out.println("b=" + numberB);
        System.out.println("a/b=" + numberA/numberB);
        
        
    } // 方法main结束
} // 类J_ExceptionByZero结束
