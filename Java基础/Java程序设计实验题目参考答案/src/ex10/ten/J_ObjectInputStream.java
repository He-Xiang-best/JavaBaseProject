package ex10.ten;

// ////////////////////////////////////////////////////////
// 
// J_ObjectInputStream.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ��ȡ�������̡�
// ////////////////////////////////////////////////////////


import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 * ʹ�ö�����������ȡ�ļ�����
 * @author ������
 * 2017.5.17
 */
public class J_ObjectInputStream
{
	/**
	 * ���ļ����ݶ�ȡ���������ظ�StringBuffer
	 * @param filename ��ȡ�ļ����ļ���
	 */
    public static StringBuffer readFile(String filename)
    {
    	StringBuffer bs=new StringBuffer();
        try
        {
            ObjectInputStream f = new ObjectInputStream(
                new FileInputStream(filename));
            
            for(Object s=f.readObject();s!=null;s=f.readObject()){  
            	//System.out.println(s);
            	bs.append(s+"\n");
            }
            f.close( );
        }
        catch (Exception e)
        {
            System.out.println("�����쳣:" + e);
            ///e.printStackTrace( );
        } // try-catch�ṹ����
        return bs;
    } // ����readFile����
} // ��J_ObjectInputStream����
