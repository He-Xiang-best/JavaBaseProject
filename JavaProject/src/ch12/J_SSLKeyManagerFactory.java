package ch12;

// ////////////////////////////////////////////////////////
// 
// J_SSLKeyManagerFactory.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//      自定义密钥管理器工厂类。
// ////////////////////////////////////////////////////////


import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;
import java.security.KeyStore;

public class J_SSLKeyManagerFactory extends KeyManagerFactorySpi
{
    public String m_alias;      // 密钥项的别名
    public KeyStore m_keystore; // 密钥库
    public char[ ] m_storepass; // 密钥库的密码
    public char[ ] m_keypass;   // 密钥项的密码

    public J_SSLKeyManagerFactory( )
    {
        m_alias = System.getProperty("Self.alias");
        m_keypass = System.getProperty("Self.keypass").toCharArray( );
    } // 构造方法J_SSLKeyManagerFactory结束

    public J_SSLKeyManagerFactory(String alias, char[ ] keypass)
    {
        m_alias = alias;
        m_keypass = keypass;
    } // 构造方法J_SSLKeyManagerFactory结束

    protected KeyManager[ ] engineGetKeyManagers( )
    {
        J_SSLKeyManager [ ] skm = new J_SSLKeyManager[1];
        skm[0] = new J_SSLKeyManager(m_keystore, m_alias,
            m_storepass, m_keypass);
        return(skm);
    } // 方法engineGetKeyManagers结束

    protected void engineInit(KeyStore ks, char[ ] password)
    {
        m_keystore = ks;
        m_storepass = password;
    } // 方法engineInit结束

    // 下面的方法没有实现
    protected void engineInit(ManagerFactoryParameters spec)
    {
    } // 方法engineInit结束
} // 类J_SSLKeyManagerFactory结束
