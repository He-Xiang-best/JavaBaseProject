
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
 * 第七章第四题
 * 进行文件的读和写
 * 第一种采用字节流
 * @author 郭晓燕
 * 2017.5.5
 *
 */
public class J_ByteIO
{
	/**
	 * 对输入流进行读取工作
	 * @param in 输入流
	 * @return 用字符串来返回读取的内容
	 */
    public static String mb_input(InputStream in)
    {
    	String s=new String("");
    	int i=0;
        try
        {
            while (true) // 接受输入并将内容加入字符串S中
            {
                i = in.read( );
                if (i==-1) // 输入流结束
                    break;
                char c = (char) i; 
                s=s+c;
             } // while循环结束
        }
        catch (IOException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
        System.out.println();
        //System.out.println(s);
        return s;
        
    } // 方法mb_echo结束

    /**
     * 往输出流写数据，请仿照204页代码完成
     * @param out 输出流
     * @param s 写的数据
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
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    	 
        
    } // 方法mb_output结束
    /**
     * 读取指定文件的内容
     * @param filename 文件名
     * @return 用字符串返回读取文件的内容
     */
    public static String readFile(String filename){
    	String s="";
    	BufferedInputStream f=null;
		try {
			f = new BufferedInputStream(new FileInputStream(filename));
			//f.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
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
     * 将指定内容写入指定文件
     * @param filename 写入的文件名
     * @param s 写入文件的内容
     */
    public static void writeFile(String filename,String s){
    	BufferedOutputStream f=null;
		try {
			f = new BufferedOutputStream(new FileOutputStream(filename));
			//f.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		mb_output(f,s);
    	try{
    		f.close();
    	}catch(IOException e){
			e.printStackTrace();
		}
    }
    /*调试作用的主方法
     * public static void main(String args[ ])
    {
    	writeFile("data.txt","grade 76,50,60,80,100");
    	readFile("data.txt");
    } // 方法main结束
*/
    } // 类J_ByteIO结束
