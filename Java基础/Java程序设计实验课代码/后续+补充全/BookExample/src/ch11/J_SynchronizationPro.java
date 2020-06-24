package ch11;

// ////////////////////////////////////////////////////////
// 
// J_Synchronization.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ��ʵ�����н������ݸ�������������̣�����˵�����̲߳������⡣
// ////////////////////////////////////////////////////////



class J_ExperimentT // ʵ��
{
    private int m_temperature, m_pressure; // �¶�����ѹ
    
    public void mb_update(int t, int p) // ���ݸ���
    {
        m_temperature = t;
        m_pressure    = p;
    } // ����mb_update����
    
    public void mb_analyze( ) // ���ݷ���
    {
        int t= m_temperature;
        int p= m_pressure;
        for (int i=0; i<1000; i++) // ������ʱ��ʹ�ò�����������׳���
            ;
        if (t!=m_temperature) // �����¶�����
        {
            System.out.print("ʵ�����ݳ������: ");
            System.out.println("t(" + t + ") != (" + m_temperature + ")");
            System.exit(0);
        } // if�ṹ����
        if (p!= m_pressure) // ������ѹ����
        {
            System.out.print("ʵ�����ݳ������: ");
            System.out.println("p(" + p + ") != (" + m_pressure + ")");
            System.exit(0);
        } // if�ṹ����
    } // ����mb_analyze����
} // ��J_Experiment1����

class J_AssistantT extends Thread // ʵ���ҵ�������Ա
{
    J_ExperimentT m_data;
    
    public J_AssistantT(J_ExperimentT d)
    {
        m_data= d;
    } // ���췽��J_Assistant����

    
    public void run( )
    {
        int i, j;
        try{
        synchronized(Class.forName("J_Assistant")){
        for(; true; )
        {
            i= (int)(Math.random( ) * 1000);
            j= (int)(Math.random( ) * 1000);
            m_data.mb_update(i, j);
        } // forѭ������
        }
        }catch(Exception e){}
    } // ����run����
} // ��J_Assistant����

class J_AnalystT extends Thread // ʵ���ҵķ�����Ա
{
    J_ExperimentT m_data;
    
    public J_AnalystT(J_ExperimentT d)
    {
        m_data= d;
    } // ���췽��J_Analyst����
    
    public void run( )
    {
        for(; true; )
        	try{
        		synchronized(Class.forName("J_Analyst")){
        		m_data.mb_analyze( );
        		}
        	}catch(Exception e){
        		
        	}
    } // ����run����
} // ��J_Analyst����

public class J_SynchronizationPro
{
    public static void main( String args[ ] )
    { 
        J_ExperimentT data= new J_ExperimentT( );
        J_AssistantT threadA = new J_AssistantT(data);
        J_AnalystT   threadB = new J_AnalystT(data);
        threadA.start( );
        threadB.start( );
    } // ����main����
} // ��J_Synchronization����
