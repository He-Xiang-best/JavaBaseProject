package ch11;

// ////////////////////////////////////////////////////////
// 
// J_Lock.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     线程死锁例程。
// ////////////////////////////////////////////////////////


public class J_Lock extends Thread
{
    public static Object m_objectA= new Object( );
    public static Object m_objectB= new Object( );

    J_Lock(String s)
    {
        super(s);
    } // J_Lock构造方法结束

    public static void mb_sleep( )
    {
        try
        {
            Thread.sleep((long)(Math.random( ) * 1000));
        }
        catch (InterruptedException e)
        {
            System.err.println("异常InterruptedException: " + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法mb_sleep结束

    public void run( )
    {
        boolean t=true;
        System.out.println(getName( ) + "开始运行");
        for( ; true; t=!t)
        {
            synchronized(t ? m_objectA : m_objectB)
            {
                System.out.println(getName( ) + ": " +
                    (t ? "对象A" : "对象B") + "被锁住");
                mb_sleep( );
                synchronized(t ? m_objectB : m_objectA)
                {
                    System.out.println(getName( ) + ": " +
                        (t ? "对象B" : "对象A") + "被锁住");
                    mb_sleep( );
                    System.out.println(getName( ) + ": " +
                        (t ? "对象B" : "对象A") + "的锁打开");
                } // 内层同步语句块结束
                System.out.println(getName( ) + ": " +
                    (t ? "对象A" : "对象B") + "的锁打开");
            } // 外层同步语句块结束
        } // for循环结束
    } // 方法run结束

    public static void main(String args[ ])
    {
        J_Lock t1 = new J_Lock("线程1");
        J_Lock t2 = new J_Lock("线程2");
        t1.start( );
        t2.start( );
    } // 方法main结束
} // 类J_Lock结束
