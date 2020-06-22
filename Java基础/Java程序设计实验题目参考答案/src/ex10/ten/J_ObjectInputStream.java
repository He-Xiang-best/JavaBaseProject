package ex10.ten;

// ////////////////////////////////////////////////////////
// 
// J_ObjectInputStream.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     读取对象例程。
// ////////////////////////////////////////////////////////


import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 * 使用对象输入流读取文件内容
 * @author 郭晓燕
 * 2017.5.17
 */
public class J_ObjectInputStream
{
	/**
	 * 将文件内容读取出来并返回给StringBuffer
	 * @param filename 读取文件的文件名
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
            System.out.println("发生异常:" + e);
            ///e.printStackTrace( );
        } // try-catch结构结束
        return bs;
    } // 方法readFile结束
} // 类J_ObjectInputStream结束
