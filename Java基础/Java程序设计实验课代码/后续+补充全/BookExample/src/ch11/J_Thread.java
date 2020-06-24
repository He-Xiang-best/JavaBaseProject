package ch11;

// ////////////////////////////////////////////////////////
// 
// J_Thread.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     通过构造类Thread的子类创建线程的例程。
// ////////////////////////////////////////////////////////

public class J_Thread extends Thread
{
    private int m_threadID;

    public J_Thread(int i)
    {
        m_threadID = i;
        System.out.println("创建线程: " + i);
    } // J_Thread构造方法结束
    
    public void run( )
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("运行线程: " + m_threadID);
            try
            {
                Thread.sleep((int)(Math.random( ) * 1000));
            }
            catch( InterruptedException e )
            {
                System.err.println("异常InterruptedException: " + e);
                e.printStackTrace( );
            } // try-catch结构结束
        } // for循环结束
    } // 方法run结束
    
    public static void main( String args[ ] )
    { 
        new J_Thread(1).start( );
        new J_Thread(2).start( );
        new J_Thread(3).start( );
        System.out.println("方法main结束");
    } // 方法main结束
} // 类J_Thread结束
