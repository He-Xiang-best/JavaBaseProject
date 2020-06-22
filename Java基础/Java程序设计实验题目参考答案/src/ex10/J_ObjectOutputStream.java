package ex10;

// ////////////////////////////////////////////////////////
// 
// J_ObjectOutputStream.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     对象输出例程。
// ////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 * 采用对象输出流将对象数组写入文件
 * @author 郭晓燕
 *2017.5.17
 */
public class J_ObjectOutputStream
{
	/**
	 * 将对象数组写入文件
	 * @param filename 写入文件的文件名
	 * @param s 写入文件的对象数组
	 */


    public static void writeFile(String filename,J_Student[] s)
    {
        try
        {
            ObjectOutputStream f = new ObjectOutputStream(
                new FileOutputStream(filename,true));
             for (J_Student st:s)
            	f.writeObject(st);
              f.close( );
        }
        catch (Exception e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法writeFile结束
} // 类J_ObjectOutputStream结束
