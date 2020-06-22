
package ex10.four;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
/**
 * �����µ�����
 * �����ļ��Ķ���д
 * ��һ�ֲ����ֽ���
 * @author ������
 * 2017.5.5
 *
 */
public class J_ByteIO
{
	/**
	 * �����������ж�ȡ����
	 * @param in ������
	 * @return ���ַ��������ض�ȡ������
	 */
    public static String mb_input(InputStream in)
    {
    	String s=new String("");
    	int i=0;
        try
        {
            while (true) // �������벢�����ݼ����ַ���S��
            {
                i = in.read( );
                if (i==-1) // ����������
                    break;
                char c = (char) i; 
                s=s+c;
             } // whileѭ������
        }
        catch (IOException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
        System.out.println();
        //System.out.println(s);
        return s;
        
    } // ����mb_echo����

    /**
     * �������д���ݣ������204ҳ�������
     * @param out �����
     * @param s д������
     */
    public static void mb_output(OutputStream out,String s)
    {
    	byte[ ] b = s.getBytes( );
        try
        {        	
        	out.write(b);
            out.flush( );
        }
        catch (IOException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    	 
        
    } // ����mb_output����
    /**
     * ��ȡָ���ļ�������
     * @param filename �ļ���
     * @return ���ַ������ض�ȡ�ļ�������
     */
    public static String readFile(String filename){
    	String s="";
    	BufferedInputStream f=null;
		try {
			f = new BufferedInputStream(new FileInputStream(filename));
			//f.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		s=mb_input(f);
    	try{
    		f.close();
    	}catch(IOException e){
			e.printStackTrace();
		}
    	return s;
    }
    /**
     * ��ָ������д��ָ���ļ�
     * @param filename д����ļ���
     * @param s д���ļ�������
     */
    public static void writeFile(String filename,String s){
    	BufferedOutputStream f=null;
		try {
			f = new BufferedOutputStream(new FileOutputStream(filename));
			//f.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		mb_output(f,s);
    	try{
    		f.close();
    	}catch(IOException e){
			e.printStackTrace();
		}
    }
    /*�������õ�������
     * public static void main(String args[ ])
    {
    	writeFile("data.txt","grade 76,50,60,80,100");
    	readFile("data.txt");
    } // ����main����
*/
    } // ��J_ByteIO����
