package ch12;

// ////////////////////////////////////////////////////////
// 
// J_ShowCertificate.java
// 
// ////////////////////////////////////////////////////////


import java.security.cert.CertificateFactory;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.math.BigInteger;

public class J_ShowCertificate
{
    public static void main(String args[ ])
    {
        if (args.length<1)
        {
            System.out.println("请给程序提供参数: 数字证书的文件名。");
            return;
        }
        try
        {
            FileInputStream fis = new FileInputStream(args[0]);
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            CertificateFactory cf = 
                CertificateFactory.getInstance("X.509");
            
            while (bis.available( ) > 0)
            {
                Certificate cert = cf.generateCertificate(bis);
                X509Certificate xcert= (X509Certificate) cert;
                System.out.println("证书内容:");

                System.out.println("版本号: " + xcert.getVersion( ));
                System.out.println("序列号: " 
                    + xcert.getSerialNumber( ).toString(16));
                System.out.println("所有者: " 
                    + xcert.getSubjectX500Principal( ));
                System.out.println("发照者: " 
                    + xcert.getIssuerX500Principal( ));
                System.out.println("有效期起始时间: " + xcert.getNotBefore( ));
                System.out.println("有效期终止时间: " + xcert.getNotAfter( ));
                System.out.println("签名算法: " + xcert.getSigAlgName( ));
                byte[ ] sig = xcert.getSignature( );
                System.out.println("签名: "
                    + (new BigInteger(sig)).toString(16));
                byte[ ] k = xcert.getPublicKey( ).getEncoded( );
                System.out.println("公钥: " 
                    + (new BigInteger(k)).toString(16));
            } // while循环结束
            bis.close( );
        }
        catch(Exception e)
        {
            System.err.println("注: main方法发生了异常。");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_ShowCertificate结束
