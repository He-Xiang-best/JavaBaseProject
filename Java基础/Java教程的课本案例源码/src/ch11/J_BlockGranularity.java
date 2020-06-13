package ch11;

// ////////////////////////////////////////////////////////
// 
// J_BlockGranularity.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     通过实例对象且具有最小同步粒度的线程同步例程。
// ////////////////////////////////////////////////////////



public class J_BlockGranularity extends Thread
{
    public static int m_data=0;
    public static int m_times=1000;
    public int m_ID;
    public boolean m_done;

    J_BlockGranularity(int id)
    {
        m_ID=id;
    } // J_BlockGranularity构造方法结束

    public void run( )
    {
        m_done=false;
        int d= ((m_ID % 2==0) ? 1 : -1);
        System.out.println("运行线程: " + m_ID + "(增量为: " + d + ")");
        try
        {
            for(int i=0; i<m_times; i++)
            for(int j=0; j<m_times; j++)
                synchronized(Class.forName("J_BlockGranularity"))
                {
                    m_data+=d;
                } // 同步语句块结束
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace( );
            System.err.println(e);
        } // try-catch结构结束
        
        m_done=true;
        System.out.println("结束线程: " + m_ID);
    } // 方法run结束
    
    public static void main(String args[ ])
    {
        J_BlockGranularity t1 = new J_BlockGranularity(1);
        J_BlockGranularity t2 = new J_BlockGranularity(2);
        t1.m_done=false;
        t2.m_done=false;
        t1.start( );
        t2.start( );
        while ( !t1.m_done || !t2.m_done ) // 等待两个线程运行结束
            ;
        System.out.println("结果: m_data=" + m_data);
    } // 方法main结束
} // 类J_BlockGranularity结束
