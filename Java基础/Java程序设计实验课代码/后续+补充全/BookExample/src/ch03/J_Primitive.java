package ch03;

public class J_Primitive
{
    public static void mb_method( int a )
    {
        System.out.println("在a++之前方法参数a=" + a);
        a++;
        System.out.println("在a++之后方法参数a=" + a);
    } // 方法mb_method结束

    public static void main(String args[ ])
    {
        int i=0;
        System.out.println("在方法调用之前变量i=" + i);
        J_Primitive.mb_method(i);
        System.out.println("在方法调用之后变量i=" + i);
    } // 方法main结束
} // 类J_Primitive结束

