package ch06;

// ////////////////////////////////////////////////////////
// 
// J_Exception.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     �쳣�������̡�
// ////////////////////////////////////////////////////////


public class J_ExceptionThrow
{
    public static void mb_throwException( )
    {
        System.out.println("�������׳�ArithmeticException���͵��쳣");
        throw new ArithmeticException( );
    } // ����mb_throwException����

    public static void mb_catchArrayException( ) //throws Exception
    {
    	try{
        mb_throwException();
    	}catch(ArrayIndexOutOfBoundsException e){System.out.println("���÷����쳣"+e);}
    	finally{}
        System.out.println("����mb_catchArrayException���н���"); 
    } // ����mb_catchArrayException����

    public static void main(String args[ ])//throws Exception 
    {
    	try{
            mb_catchArrayException();
    	}catch (Exception e){
    		System.err.println("���������쳣"+e);
    	}
    	finally{
    		System.out.println("main����finally����");
    	}
        System.out.println("�쳣�������"); 
    } // ����main����
} // ��J_Exception����
