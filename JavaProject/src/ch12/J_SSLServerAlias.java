package ch12;

// ////////////////////////////////////////////////////////
// 
// J_SSLServerAlias.java
// 
// ////////////////////////////////////////////////////////


import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLServerSocket;
import java.security.KeyStore;
import java.security.Security;
import java.net.Socket;
import java.net.InetAddress;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class J_SSLServerAlias
{
    public static void main(String args[ ])
    {
        // 指定密钥项别名及密钥项密码
        System.setProperty("Self.alias", "oldmark");
        System.setProperty("Self.keypass", "ks123456");
        try
        {
            Security.addProvider(new J_SelfProvider( ));
            SSLContext sc = SSLContext.getInstance("SSL");
            KeyStore ks = KeyStore.getInstance("JKS");
            char password [ ] = "ks123456".toCharArray( );

            // 加载密钥库
            ks.load(new FileInputStream("new.keystore"), password);

            // 获取服务器端套接字工厂的实例对象
            KeyManagerFactory kmf = KeyManagerFactory.getInstance("Self");
            kmf.init(ks, password);
            sc.init(kmf.getKeyManagers( ), null, null);
            SSLServerSocketFactory ssf = sc.getServerSocketFactory( );

            // 创建服务器端套接字
            SSLServerSocket ss =
                (SSLServerSocket)ssf.createServerSocket(5000);

            int i=0;
            while (true)
            {
                System.out.println("[" + (++i)
                    + "]: 等待来自客户端的连接... ...");
                Socket s = ss.accept( );
                PrintWriter pw = new PrintWriter(s.getOutputStream( ));
                InetAddress sa = s.getInetAddress( );
                InetAddress ca = s.getLocalAddress( );  

                System.out.println("服务器端向客户端发送信息:");
                String str;
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
            System.err.println("注: main方法发生了例外。");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_SSLServerAlias结束
