package ch06;

// ////////////////////////////////////////////////////////
// 
// J_Example.java
// 
// ���:
//     ʹ����J_Singleton��ʵ����������̡�
// ////////////////////////////////////////////////////////


public class J_Example
{
    public static void main(String args[ ])
    {
        J_Singleton a = J_Singleton.mb_getObject( );
        J_Singleton b = J_Singleton.mb_getObject( );
        if (a==b)
            System.out.println("a��bָ��ͬһ��ʵ������");
        else
            System.out.println("a��bָ��ͬ��ʵ������");
    } // ����main����
} // ��J_Example����
