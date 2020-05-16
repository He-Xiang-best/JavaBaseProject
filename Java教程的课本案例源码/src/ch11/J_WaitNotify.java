package ch11;

// ////////////////////////////////////////////////////////
// 
// J_WaitNotify.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ����wait��notify��Ա���������߳�ͬ�������̡�
// ////////////////////////////////////////////////////////


class J_Experiment4
{
    private int m_temperature, m_pressure;
    private boolean m_ready=false;
    
    public synchronized void mb_update(int t, int p)
    {
        System.out.println("������·����ڲ�:");
        if (m_ready) // ǰ����µ����ݻ�û�б�����
        {
            System.out.println("    �ȴ����ݷ������...");
            try
            {
                wait( ); // �ȴ����ݷ���
            }
            catch(Exception e)
            {
                e.printStackTrace( );
                System.err.println(e);
            } // try-catch�ṹ����
            System.out.println("    ������������...");
        } // if������
        m_temperature = t;
        m_pressure    = p;
        System.out.println("�������: �¶�ֵΪ" + t + ", ��ѹֵΪ" + p);
        m_ready=true;
        notify( );
    } // ͬ������mb_update����
    
    public synchronized void mb_analyze( )
    {
        System.out.println("�������ݷ��������ڲ�:");
        if (!m_ready) // ���ݻ�û�и���
        {
            System.out.println("    �ȴ����ݸ������...");
            try
            {
                wait( ); // �ȴ����ݸ���
            }
            catch(Exception e)
            {
                e.printStackTrace( );
                System.err.println(e);
            } // try-catch�ṹ����
            System.out.println("    ������������...");
        } // if������
        int t= m_temperature;
        int p= m_pressure;
        System.out.println("�������: �¶�ֵΪ" + t + ", ��ѹֵΪ" + p);
        m_ready=false;
        notify( );
    } // ͬ������mb_analyze����
} // ��J_Experiment����

class J_Assistant1 extends Thread
{
    J_Experiment4 m_data;
    
    public J_Assistant1(J_Experiment4 d)
    {
        m_data= d;
    } // ���췽��J_Assistant����

    public void run( )
    {
        System.out.println("�����߳̿�ʼ����");
        int i, j, k;
        for(k=0; k<3; k++)
        {
            i= (int)(Math.random( ) * 1000);
            j= (int)(Math.random( ) * 1000);
            m_data.mb_update(i, j);
        } // forѭ������
        System.out.println("�����߳̽�������");
    } // ����run����
} // ��J_Assistant����

class J_Analyst1 extends Thread
{
    J_Experiment4 m_data;
    
    public J_Analyst1(J_Experiment4 d)
    {
        m_data= d;
    } // ���췽��J_Analyst����
    
    public void run( )
    {
        System.out.println("����Ա�߳̿�ʼ����");
        for(int k=0; k<3; k++)
            m_data.mb_analyze( );
        System.out.println("����Ա�߳̽�������");
    } // ����run����
} // ��J_Analyst1����

public class J_WaitNotify
{
    public static void main( String args[ ] )
    { 
        J_Experiment4 data= new J_Experiment4( );
        J_Assistant1 threadA = new J_Assistant1(data);
        J_Analyst1   threadB = new J_Analyst1(data);
        threadA.start( );
        threadB.start( );
        System.out.println("����main����");
    } // ����main����
} // ��J_WaitNotify����
