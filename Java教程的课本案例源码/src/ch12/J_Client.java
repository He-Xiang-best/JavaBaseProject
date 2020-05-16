package ch12;

// ////////////////////////////////////////////////////////
// 
// J_Client.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     基于TCP通讯例程的客户端程序。
// ////////////////////////////////////////////////////////


import java.io.DataInputStream;
import java.net.Socket;

public class J_Client
{
    public static void main(String args[ ])
    {
        try
        {
            Socket s = new Socket("localhost", 5000);
            DataInputStream dataIn
                = new DataInputStream(s.getInputStream( ));
            System.out.println("客户端接收到: " + dataIn.readUTF( ));
            dataIn.close( );
            s.close( );
        }
        catch (Exception e)
        { 
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束 
    } // 方法main结束
} // 类J_Client结束
