package ch06;

// ////////////////////////////////////////////////////////
// 
// J_ExceptionByZeroThrows.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ����Ϊ0���쳣�׳����̡�
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
    } // ����main����
} // ��J_ExceptionByZero����
