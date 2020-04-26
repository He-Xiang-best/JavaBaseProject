package ch12;

// ////////////////////////////////////////////////////////
// 
// J_ShowKeystore.java
// 
// ////////////////////////////////////////////////////////
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.util.Enumeration;
import java.math.BigInteger;

public class J_ShowKeystore
{
    public static void main(String args[ ])
    {
        String ks_name;
        if (args.length<1)
        {
            // 获取系统默认密钥库的路径及其名称
            ks_name = System.getProperty("user.home") + "\\.keystore";
        }
        else ks_name = args[0];
        System.out.println("密钥库" + ks_name + "的一些信息如下:");
        try
        {
            FileInputStream fis = new FileInputStream(ks_name);
            KeyStore ks = KeyStore.getInstance("JKS");
            String password = "ks123456"; // 密钥库的密码
            String epw = "key123456";     // 密钥项的密码
            String a;       // 密钥项别名
            PrivateKey pk;  // 密钥项私钥
            byte[ ] k;
            if (args.length>1)
                password = args[1]; // 由程序参数指定密钥库密码

            ks.load(fis, password.toCharArray( ));
    
            // 获取并显示在密钥库中的密钥项别名
            Enumeration<String> e = ks.aliases( ); // 获取各个密钥项别名
            while (e.hasMoreElements( ))
            {
                a = e.nextElement( ); // 取出密钥项别名
                System.out.println("密钥项" + a + "的私钥是:");

                // 获取密钥项私钥
                pk = (PrivateKey) ks.getKey(a, epw.toCharArray( ));
                k = pk.getEncoded( );
                System.out.println((new BigInteger(k)).toString(16));
            } // while循环结束
        }
        catch(Exception e)
        {
            System.err.println("注: main方法发生了异常。");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_ShowKeystore结束
