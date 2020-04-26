
package ch07;

// ////////////////////////////////////////////////////////
// 
// J_Echo.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     回声(echo)例程。
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
            while (true) // 接受输入并回显
            {
                i = in.read( );
                if (i==-1) // 输入流结束
                    break;
                char c = (char) i; 
                
                System.out.print(c); 
            } // while循环结束
        }
        catch (IOException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
        System.out.println( ); 
        
    } // 方法mb_echo结束

    public static void main(String args[ ])
    {
    	FileInputStream f=null;
		try {
			f = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	mb_echo(f);
    } // 方法main结束
} // 类J_Echo结束
