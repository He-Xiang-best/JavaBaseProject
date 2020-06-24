package ch12;

// ////////////////////////////////////////////////////////
// 
// J_SelfProvider.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//      自定义安全提供程序。
// ////////////////////////////////////////////////////////


import java.security.Provider;

public class J_SelfProvider extends Provider
{
    public J_SelfProvider( )
    {
        super("Self", 1, "Self Provider 1.1");
        put("KeyManagerFactory.Self", "J_SSLKeyManagerFactory");
    }  // 构造方法J_SelfProvider结束
} // 类J_SelfProvider结束
