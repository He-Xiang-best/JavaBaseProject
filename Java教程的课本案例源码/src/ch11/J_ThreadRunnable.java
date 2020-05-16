package ch11;

// ////////////////////////////////////////////////////////
// 
// J_ThreadRunnable.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     通过接口Runnable构造线程的例程。
// ////////////////////////////////////////////////////////

public class J_ThreadRunnable implements Runnable
{
    private int m_threadID;

    public J_ThreadRunnable(int i)
    {
        m_threadID=i;
        System.out.println("创建线程: " + i );
    } // J_ThreadRunnable构造方法结束
    
    public void run( )
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("运行线程: " + m_threadID);
            try
            {
                Thread.sleep((int)(Math.random( ) * 1000));
            }
            catch ( InterruptedException e )
            {
                System.err.println("异常InterruptedException: " + e);
                e.printStackTrace( );
            } // try-catch结构结束
        } // for循环结束
    } // 方法run结束

    public static void main( String args[ ] )
    {
        Thread t1= new Thread(new J_ThreadRunnable(1));
        t1.start( );
        Thread t2= new Thread(new J_ThreadRunnable(2));
        t2.start( );
        System.out.println("方法main结束");
    } // 方法main结束
} // 类J_ThreadRunnable结束
