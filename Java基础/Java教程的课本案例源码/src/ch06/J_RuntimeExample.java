package ch06;

// ////////////////////////////////////////////////////////
// 
// J_RuntimeExample.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     类java.lang.Runtime的应用例程。
// ////////////////////////////////////////////////////////


public class J_RuntimeExample
{
    public static void main(String args[ ])
    {
        Runtime r = Runtime.getRuntime( );
        System.out.println("处理器个数是" + r.availableProcessors( ));
        try
        {
            r.exec("cmd /c start dir");
            r.exec("notepad");
        }
        catch(Exception e)
        {
            System.err.println("命令运行不正常!");
            e.printStackTrace( );
        } // try-catch结构结束
        System.out.println("可用的最大内存为: " + r.maxMemory( ));
        System.out.println("现在的总内存为: " + r.totalMemory( ));
        System.out.println("现在空闲内存为: " + r.freeMemory( ));
        r.gc( );
        System.out.println("现在空闲内存为: " + r.freeMemory( ));
    } // 方法main结束
} // 类J_RuntimeExample结束
