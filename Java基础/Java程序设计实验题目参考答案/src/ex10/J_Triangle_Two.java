package ex10;

// ////////////////////////////////////////////////////////
// 
// J_Write.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ��������̡�
// ////////////////////////////////////////////////////////


import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class J_Triangle_Two
{
    public static void mb_write(OutputStream out,String s)
    {
       //String s = "���������";
        byte[ ] b = s.getBytes( );
        try
        {
        	
        	out.write(b);
            out.flush( );
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����mb_write����
    
    /**
	 * ʹ��System.outϵͳ�������ӡ����������
	 *  @param length ���������ε�����
	 */
    public static String getTriangle(int length){  
    	StringBuffer tri=new StringBuffer();
    	for (int i=0;i<length;i++){
    		for (int m=0;m<i;m++)
    			tri.append(" ");
    		for (int n=0;n<2*(length-1-i)+1;n++)
    			tri.append("*");
    		tri.append("\r\n");
    	}//end for 
    	return tri.toString();
    }
    
    public static void main(String args[ ])
    {
    	 
 		String s=getTriangle(8);
 		try {
 			//���������������������̨��
 			mb_write(System.out,s);
			//������������������ļ���
			mb_write(new PrintStream("triangle2.txt"),s);			
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
    	
		
	        
      } // ����main����
} // ��J_Write����
