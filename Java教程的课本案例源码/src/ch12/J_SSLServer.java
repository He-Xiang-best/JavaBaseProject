package ch12;

// ////////////////////////////////////////////////////////
// 
// J_SSLServer.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     基于SSL的服务器端程序。
// ////////////////////////////////////////////////////////

import javax.net.ssl.SSLServerSocketFactory;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J_SSLServer
{
    public static void main(String args[ ])
    {
        // 指定密钥库及其密码
        System.setProperty("javax.net.ssl.keyStore", ".\\new.keystore");
        System.setProperty("javax.net.ssl.keyStorePassword", "ks123456");

        // 获取服务器端套接字工厂的实例对象
        SSLServerSocketFactory ssf = (SSLServerSocketFactory)
            SSLServerSocketFactory.getDefault( );
        try
        {
            // 创建服务器端套接字
            ServerSocket ss = ssf.createServerSocket(5000);

            int i=0;
            while (true)
            {
                System.out.println("[" + (++i)
                    + "]: 等待来自客户端的连接... ...");
                Socket s = ss.accept( ); // 监听并等待来自客户端的连接
                PrintWriter pw = new PrintWriter(s.getOutputStream( ));
                InetAddress sa = s.getInetAddress( );
                InetAddress ca = s.getLocalAddress( );  

                String str;
                System.out.println("服务器端向客户端发送信息:");
                str = 
                    "来自"
                    + ca.getHostAddress( ) + "(" + s.getLocalPort( ) + ")"
                    + "向"
                    + sa.getHostAddress( ) + "(" + s.getPort( ) + ")"
                    + "发出的问候。";
                System.out.println(str);
                pw.println(str);
                pw.flush( );

                System.out.println("服务器端接收客户端信息:");
                BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream( )));

                str=br.readLine( );
                System.out.println(str);

                br.close( );
                pw.close( );
                s.close( );
            } // while循环结束
        }
        catch(Exception e)
        {
            System.err.println("注: main方法发生了异常。");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_SSLServer结束
