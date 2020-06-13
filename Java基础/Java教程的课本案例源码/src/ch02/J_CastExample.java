package ch02;
public class J_CastExample
{
    public static void main(String args[ ])
    {
        short  a= 100;
        long   b= a; // 隐式类型转换

        System.out.println("类型转换: 短整数" + a + "变成长整数" + b);
        b= 123456789L;
        a= (short)b; // 显式类型转换，强制类型转换
        System.out.println("类型转换: 长整数" + b + "变成短整数" + a);
        System.out.println(3/6*12);
        //;

    } // 方法main结束
} // 类J_CastExample结束
