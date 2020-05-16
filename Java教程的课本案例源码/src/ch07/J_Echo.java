
package ch07;

// ////////////////////////////////////////////////////////
// 
// J_Echo.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ����(echo)���̡�
// ////////////////////////////////////////////////////////



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;

public class J_Echo
{
    public static void mb_echo(InputStream in)
    {
    	int i=0;
        try
        {
            while (true) // �������벢����
            {
                i = in.read( );
                if (i==-1) // ����������
                    break;
                char c = (char) i; 
                
                System.out.print(c); 
            } // whileѭ������
        }
        catch (IOException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
        System.out.println( ); 
        
    } // ����mb_echo����

    public static void main(String args[ ])
    {
    	FileInputStream f=null;
		try {
			f = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
    	mb_echo(f);
    } // ����main����
} // ��J_Echo����
