package ch11;

// ////////////////////////////////////////////////////////
// 
// J_BlockData.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     通过实例对象进行线程同步的例程。
// ////////////////////////////////////////////////////////



class J_Experiment
{
    public static void mb_sleep(long millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {
            System.err.println("异常InterruptedException: " + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法mb_sleep结束

    public void m_method1(int id)
    {
        System.out.println("线程" + id + "进入方法1");
        mb_sleep(1000);
        System.out.println("线程" + id + "离开方法1");
    } // 方法m_method1结束

    public void m_method2(int id)
    {
        System.out.println("线程" + id + "进入方法2");
        mb_sleep(1000);
        System.out.println("线程" + id + "离开方法2");
    } // 方法m_method2结束
} // 类J_Experiment结束

public class J_BlockData extends Thread
{
    public int m_ID;
    public J_Experiment m_data;

    J_BlockData(int id)
    {
        m_ID=id;
    } // J_BlockData构造方法结束

    public void run( )
    {
        System.out.println("运行线程: " + m_ID);
        synchronized(m_data)
        {
            System.out.println("进入同步语句块的是线程: " + m_ID);
            m_data.m_method1(m_ID);
            m_data.m_method2(m_ID);
            System.out.println("离开同步语句块的是线程: " + m_ID);
        }
        System.out.println("结束线程: " + m_ID);
    } // 方法run结束
    
    public static void main(String args[ ])
    {
        int n=2;
        J_BlockData [ ] t = new J_BlockData[n];
        J_Experiment d = new J_Experiment( );
        for(int i=0; i< n; i++)
        {
            t[i] = new J_BlockData(i);
            t[i].m_data = d;
            t[i].start( );
        } // for循环结束
        System.out.println("方法main结束");
    } // 方法main结束
} // 类J_BlockData结束
