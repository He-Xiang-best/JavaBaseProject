package ch06.t06_03_01;

// ////////////////////////////////////////////////////////
// 
// J_Singleton.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ������ʵ�����̡�
// ////////////////////////////////////////////////////////


public class J_Singleton
{
    private static J_Singleton m_object;

    // ���幹�췽��: ���������д���������ʵ������
    private J_Singleton( )
    {
    } // J_Singleton���췽������

    // ���ص���ʵ�����������(�����û�д��������򴴽��ö���)
    public static J_Singleton mb_getObject( )
    {
        if (m_object == null)
            m_object = new J_Singleton( );
        return m_object;
    } // ����mb_getObject����
} // ��J_Singleton����
