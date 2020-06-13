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
            while ((s = r.readLine( )) != null) // ��ȡ������Դ��Ϣ
                System.out.println(s); // ���������Դ��Ϣ
            r.close( );
        }
        catch (Exception e)
        { 
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ���� 
    } // ����main����
} // ��J_UrlReadData����
