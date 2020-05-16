// ////////////////////////////////////////////////////////
// 
// J_StringBuffer.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     字符串缓冲区例程。
// ////////////////////////////////////////////////////////
package ch04;

public class J_StringBuffer
{
    public static void main(String args[ ])
    {
        StringBuffer b = new StringBuffer("0123");
        System.out.println("字符串缓冲区的字符序列为\"" + b + "\"");
        System.out.println("字符串缓冲区的长度是" +  b.length( ) );
        System.out.println("字符串缓冲区的容量是" +  b.capacity( ) );

        b.ensureCapacity(25);
        System.out.println( );
        System.out.println("在调用\"b.ensureCapacity(25)\"之后");
        System.out.println("字符串缓冲区的字符序列为\"" + b + "\"");
        System.out.println("字符串缓冲区的长度是" +  b.length( ) );
        System.out.println("字符串缓冲区的容量是" +  b.capacity( ) );
    } // 方法main结束
} // 类J_StringBuffer结束
