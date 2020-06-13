package ch06;

// ////////////////////////////////////////////////////////
// 
// J_Singleton.java
// ////////////////////////////////////////////////////////
// 简介:
//     单体类实现例程。
// ////////////////////////////////////////////////////////


public class J_Singleton
{
    private static J_Singleton m_object = new J_Singleton( );

    // 定义构造方法: 不允许自行创建这个类的实例对象
    private J_Singleton( )
    {
    } // J_Singleton构造方法结束

    // 返回单体实例对象的引用
    public static J_Singleton mb_getObject( )
    {
        return m_object;
    } // 方法mb_getObject结束
} // 类J_Singleton结束
