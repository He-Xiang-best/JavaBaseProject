package ch06;

// ////////////////////////////////////////////////////////
// 
// J_Singleton.java
// ////////////////////////////////////////////////////////
// ���:
//     ������ʵ�����̡�
// ////////////////////////////////////////////////////////


public class J_Singleton
{
    private static J_Singleton m_object = new J_Singleton( );

    // ���幹�췽��: ���������д���������ʵ������
    private J_Singleton( )
    {
    } // J_Singleton���췽������

    // ���ص���ʵ�����������
    public static J_Singleton mb_getObject( )
    {
        return m_object;
    } // ����mb_getObject����
} // ��J_Singleton����
