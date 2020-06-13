// ////////////////////////////////////////////////////////
// 
// J_Genericity.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     具有多父类型的类型变量泛型例程。
// ////////////////////////////////////////////////////////
package ch05;

class J_C1
{
    public void mb_methodA( )
    {
        System.out.print("A");
    } // 方法mb_methodA结束
} // 类J_C1结束

interface J_C2
{
    public void mb_methodB( );
} // 接口J_C2结束

class J_C3 extends J_C1 implements J_C2
{
    public void mb_methodB( )
    {
        System.out.print("B");
    } // 方法mb_methodB结束
} // 类J_C3结束

class J_T <T extends J_C1 & J_C2>
{
    public void mb_methodT( T t )
    {
        t.mb_methodA( );
        t.mb_methodB( );
    } // 方法mb_methodT结束
} // 类J_T结束

public class J_Genericity
{
    public static void main(String args[ ])
    {
        J_T<J_C3> a = new J_T<J_C3>( );
        a.mb_methodT( new J_C3( ) );
    } // 方法main结束
} // 类J_Genericity结束
