package ch11;

// ////////////////////////////////////////////////////////
// 
// J_ThreadUser.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     用户线程例程(为了与后台线程比较运行的机制)。
// ////////////////////////////////////////////////////////

public class J_ThreadUser extends Thread
{
    public void run( )
    {
        for(int i=0; true; i++)
        {
            System.out.println("线程在运行: " + i);
            try
            {
                sleep((int)(Math.random( ) * 1000));
            }
            catch( InterruptedException e )
            {
                System.err.println(e);
            } // try-catch结构结束
        } // for循环结束
    } // 方法run结束
    
    public static void main(String args[ ])
    {
        J_ThreadUser t = new J_ThreadUser( );
        t.start( );
        if (t.isDaemon( ))
            System.out.println("创建一个后台线程");
        else
            System.out.println("创建一个用户线程");
        System.out.println("主方法运行结束");
    } // 方法main结束
} // 类J_ThreadUser结束
