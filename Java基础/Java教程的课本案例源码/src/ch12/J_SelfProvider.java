package ch12;

// ////////////////////////////////////////////////////////
// 
// J_SelfProvider.java
// 
// ////////////////////////////////////////////////////////
// ���:
//      �Զ��尲ȫ�ṩ����
// ////////////////////////////////////////////////////////


import java.security.Provider;

public class J_SelfProvider extends Provider
{
    public J_SelfProvider( )
    {
        super("Self", 1, "Self Provider 1.1");
        put("KeyManagerFactory.Self", "J_SSLKeyManagerFactory");
    }  // ���췽��J_SelfProvider����
} // ��J_SelfProvider����
