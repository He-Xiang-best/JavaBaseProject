package ch06;

// ////////////////////////////////////////////////////////
// 
// J_ExceptionByZero.java
// ////////////////////////////////////////////////////////
// ���:
//     ����Ϊ0���쳣���̡�
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
        
        
    } // ����main����
} // ��J_ExceptionByZero����
