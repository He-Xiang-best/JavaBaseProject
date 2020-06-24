package ch12;

// ////////////////////////////////////////////////////////
// 
// J_SSLKeyManager.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//      实现接口javax.net.ssl.X509KeyManager的密钥管理器类例程。
// ////////////////////////////////////////////////////////


import javax.net.ssl.X509KeyManager;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.net.Socket;

public class J_SSLKeyManager implements X509KeyManager
{
    protected String m_alias;      // 密钥项的别名
    protected KeyStore m_keystore; // 密钥库
    protected char[ ] m_storepass; // 密钥库的密码
    protected char[ ] m_keypass;   // 密钥项的密码
    private String m_type;         // m_alias密钥项的公钥的加密算法类型名称
    private String m_issuer;       // m_alias密钥项的证书发照者

    public J_SSLKeyManager(KeyStore ks, String s, 
                char[ ] storepass, char [ ] keypass)
    {
        m_keystore = ks;
        m_alias = s;
        m_storepass = storepass;
        m_keypass = keypass;
        try
        {
            Certificate c = ks.getCertificate(s);
            m_type = c.getPublicKey( ).getAlgorithm( );
            m_issuer = 
                ((X509Certificate) c).getIssuerX500Principal( ).getName( );
        }
        catch(Exception e)
        {
            System.err.println("注: J_SSLKeyManager构造方法发生了异常。");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 构造方法J_SSLKeyManager结束

    // 注: 下面方法没有用到参数s, 它可以为null
    public String chooseClientAlias(String[ ] keyType,
                Principal[ ] issuers, Socket s)
    {
        if (keyType==null)
            return null;
        int i;
        for (i=0; i < keyType.length; i++)
            if (m_type.equals(keyType[i]))
            {
                i=-1;
                break;
            } // if和for结构结束
        if (i!=-1) // 说明加密算法类型不匹配
            return null;
        if (issuers==null) // 说明参数issuers可以不用考虑
            return m_alias;
        for (i=0; i < issuers.length; i++)
            if (m_issuer.equals(issuers[i].getName( )))
                return m_alias;
        return null;
    } // 方法chooseClientAlias结束

    // 注: 下面方法没有用到参数s, 它可以为null
    public String chooseServerAlias(String keyType,
                Principal[ ] issuers, Socket s)
    {
        String [ ] ks = {keyType};
        return(chooseClientAlias(ks, issuers, s));
    } // 方法chooseServerAlias结束

    // 获得别名alias对应的证书链
    public X509Certificate[ ] getCertificateChain(String alias)
    {
        try
        {
            Certificate [ ] c = m_keystore.getCertificateChain(alias);
            if (c==null)
                return(null);
            if (c.length==0)
                return(null);
            X509Certificate [ ] xc = new X509Certificate[c.length];
            System.arraycopy(c, 0, xc, 0, c.length);
            return(xc);
        }
        catch(Exception e)
        {
            System.err.println("注: 类J_SSLKeyManager的"
                + "getCertificateChain方法发生了异常。");
            System.err.println(e);
            e.printStackTrace( );
            return null;
        } // try-catch结构结束
    } // 方法getCertificateChain结束

    public String[ ] getClientAliases(String keyType, Principal[ ] issuers)
    {
        String [ ] s;
        String alias = chooseServerAlias(keyType, issuers, null);
        if (alias==null)
            return null;
        else
        {
            s = new String[1];
            s[0] = alias;
        } // if-else结构结束
        return s;
    } // 方法getClientAliases结束

    public PrivateKey getPrivateKey(String alias)
    {
        try
        {
            return((PrivateKey)(m_keystore.getKey(alias, m_keypass)));
        }
        catch(Exception e)
        {
            System.err.println("注: 类J_SSLKeyManager的"
                + "getPrivateKey方法发生了异常。");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch结构结束
        return(null);
    } // 方法getPrivateKey结束

    public String[ ] getServerAliases(String keyType, Principal[ ] issuers)
    {
        return(getClientAliases(keyType, issuers));
    } // 方法getServerAliases结束
} // 类J_SSLKeyManager结束
