package ch12;

// ////////////////////////////////////////////////////////
// 
// J_Url.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ����ͳһ��Դ��λ��ַ(URL)���̡�
// ////////////////////////////////////////////////////////


import java.net.URL;
import java.net.MalformedURLException;

public class J_Url
{
    public static void main(String args[ ])
    {
        try
        {
            URL u = new URL("http://www.tsinghua.edu.cn/chn/index.html"); 
            System.out.println("��URL(" + u + ")����:"); 
            System.out.println("Э����" + u.getProtocol( )); 
            System.out.println("��������" + u.getHost( )); 
            System.out.println("�ļ�����" + u.getFile( )); 
            System.out.println("�˿ں���" + u.getPort( )); 
            System.out.println("������" + u.getRef( )); 
        }
        catch (MalformedURLException e)
        { 
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ���� 
    } // ����main����
} // ��J_Url����