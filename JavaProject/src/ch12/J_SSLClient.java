package ch12;

// ////////////////////////////////////////////////////////
// 
// J_SSLClient.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//      基于SSL的客户端程序。
// ////////////////////////////////////////////////////////

import javax.net.ssl.SSLSocketFactory;
import java.net.Socket;
import java.net.InetAddress;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J_SSLClient
{
    public static void main(String args[ ])
    {
        String host = (args.length>=1 ? args[0] : "localhost");
        int port;

        // 指定信任密钥库
        System.setProperty("javax.net.ssl.trustStore",
            ".\\client.trustStore");

        // 获取套接字工厂的实例对象
        SSLSocketFactory sf = 
            (SSLSocketFactory)SSLSocketFactory.getDefault( );
        try
        {
            if (args.length>=2)
                port= Integer.parseInt(args[1]);
            else port= 5000;

            // 获取套接字，与服务器端建立连接
            Socket s = sf.createSocket(host, port);

            InetAddress sa = s.getInetAddress( );
            InetAddress ca = s.getLocalAddress( );  

            System.out.println("客户端接收服务器端信息:");
            BufferedReader br = new BufferedReader(
                new InputStreamReader(s.getInputStream( )));
            String str;
            str=br.readLine( );
            System.out.println(str);

            System.out.println("客户端向服务器端发送信息:");
            PrintWriter pw = new PrintWriter(s.getOutputStream( ));
            str = 
                "客户端"
                + ca.getHostAddress( ) + "(" + s.getLocalPort( ) + ")"
                + "应答服务器端"
                + sa.getHostAddress( ) + "(" + s.getPort( ) + ")"
                + "。";
            System.out.println(str);
            pw.println(str);
            pw.flush( );

            pw.close( );
            br.close( );
            s.close( );
        }
        catch(Exception e)
        {
            System.err.println("注: main方法发生了异常。");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_SSLClient结束
