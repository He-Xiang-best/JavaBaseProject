package ch11;

// ////////////////////////////////////////////////////////
// 
// J_BlockThis.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     线程同步例程: 说明类的实例对象与静态成员域之间的关系。
// ////////////////////////////////////////////////////////



public class J_BlockThis extends Thread
{
    public static int m_data=0;
    public static int m_times=10000;
    public int m_ID;
    public boolean m_done;

    J_BlockThis(int id)
    {
        m_ID=id;
    } // J_BlockThis构造方法结束

    public void run( )
    {
        m_done=false;
        int d= ((m_ID % 2==0) ? 1 : -1);
        System.out.println("运行线程: " + m_ID + "(增量为: " + d + ")");
        
		/*synchronized(Class.forName(arg0))
        {
            System.out.println("线程: " + m_ID
                + "进入同步语句块, m_data=" + m_data);
            for(int i=0; i<m_times; i++)
            for(int j=0; j<m_times; j++)
                m_data+=d;
            System.out.println("线程: " + m_ID
                + "离开同步语句块, m_data=" + m_data);
        } // 同步语句块结束
*/        
        m_done=true;
        System.out.println("结束线程: " + m_ID);
    } // 方法run结束
    
    public static void main(String args[ ])
    {
        J_BlockThis t1 = new J_BlockThis(1);
        J_BlockThis t2 = new J_BlockThis(2);
        t1.m_done=false;
        t2.m_done=false;
        t1.start( );
        t2.start( );
        while ( !t1.m_done || !t2.m_done ) // 等待两个线程运行结束
            ;
        System.out.println("结果: m_data=" + m_data);
    } // 方法main结束
} // 类J_BlockThis结束
