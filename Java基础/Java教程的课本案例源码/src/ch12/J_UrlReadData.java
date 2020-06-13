package ch12;

// ////////////////////////////////////////////////////////
// 
// J_UrlReadData.java
// 
// ////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class J_UrlReadData
{
    public static void main(String args[ ])
    {
        try
        {
            URL u = new URL("http://www.tsinghua.edu.cn/chn/index.htm");
            BufferedReader r = new BufferedReader(
                new InputStreamReader(u.openStream( )));
            String s;
            while ((s = r.readLine( )) != null) // 获取网络资源信息
                System.out.println(s); // 输出网络资源信息
            r.close( );
        }
        catch (Exception e)
        { 
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束 
    } // 方法main结束
} // 类J_UrlReadData结束
