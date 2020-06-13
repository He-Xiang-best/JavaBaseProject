package ch11;

// ////////////////////////////////////////////////////////
// 
// J_Synchronization.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     在实验室中进行数据更新与分析的例程，用于说明多线程并发问题。
// ////////////////////////////////////////////////////////



class J_ExperimentT // 实验
{
    private int m_temperature, m_pressure; // 温度与气压
    
    public void mb_update(int t, int p) // 数据更新
    {
        m_temperature = t;
        m_pressure    = p;
    } // 方法mb_update结束
    
    public void mb_analyze( ) // 数据分析
    {
        int t= m_temperature;
        int p= m_pressure;
        for (int i=0; i<1000; i++) // 进行延时，使得并发问题更容易出现
            ;
        if (t!=m_temperature) // 分析温度数据
        {
            System.out.print("实验数据出现情况: ");
            System.out.println("t(" + t + ") != (" + m_temperature + ")");
            System.exit(0);
        } // if结构结束
        if (p!= m_pressure) // 分析气压数据
        {
            System.out.print("实验数据出现情况: ");
            System.out.println("p(" + p + ") != (" + m_pressure + ")");
            System.exit(0);
        } // if结构结束
    } // 方法mb_analyze结束
} // 类J_Experiment1结束

class J_AssistantT extends Thread // 实验室的助理人员
{
    J_ExperimentT m_data;
    
    public J_AssistantT(J_ExperimentT d)
    {
        m_data= d;
    } // 构造方法J_Assistant结束

    
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
        } // for循环结束
        }
        }catch(Exception e){}
    } // 方法run结束
} // 类J_Assistant结束

class J_AnalystT extends Thread // 实验室的分析人员
{
    J_ExperimentT m_data;
    
    public J_AnalystT(J_ExperimentT d)
    {
        m_data= d;
    } // 构造方法J_Analyst结束
    
    public void run( )
    {
        for(; true; )
        	try{
        		synchronized(Class.forName("J_Analyst")){
        		m_data.mb_analyze( );
        		}
        	}catch(Exception e){
        		
        	}
    } // 方法run结束
} // 类J_Analyst结束

public class J_SynchronizationPro
{
    public static void main( String args[ ] )
    { 
        J_ExperimentT data= new J_ExperimentT( );
        J_AssistantT threadA = new J_AssistantT(data);
        J_AnalystT   threadB = new J_AnalystT(data);
        threadA.start( );
        threadB.start( );
    } // 方法main结束
} // 类J_Synchronization结束
