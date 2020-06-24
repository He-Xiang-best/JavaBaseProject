package ch11;

// ////////////////////////////////////////////////////////
// 
// J_ThreadSum.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     由于多线程共享内存引发问题的例程——加减法失败。
// ////////////////////////////////////////////////////////


public class J_ThreadSum extends Thread
{
    public static int m_data=0;
    public static int m_times=10000;
    public int m_ID;
    public boolean m_done;

    J_ThreadSum(int id)
    {
        m_ID=id;
    } // J_ThreadSum构造方法结束

    public void run( )
    {
        m_done=false;
        int d= ((m_ID % 2==0) ? 1 : -1);
        System.out.println("运行线程: " + m_ID + "(增量为: " + d + ")");
        for(int j=0; j<m_times; j++)
            m_data+=d;
        m_done=true;
        System.out.println("结束线程: " + m_ID);
    } // 方法run结束
    
    public static void main(String args[ ])
    {
        J_ThreadSum t1 = new J_ThreadSum(1);
        J_ThreadSum t2 = new J_ThreadSum(2);
        t1.m_done=false;
        t2.m_done=false;
        t1.start( );
        t2.start( );
        while ( !t1.m_done || !t2.m_done ) // 等待两个线程运行结束
            ;
        System.out.println("结果: m_data=" + m_data);
    } // 方法main结束
} // 类J_ThreadSum结束
