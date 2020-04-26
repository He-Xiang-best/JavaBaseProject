package ch11;

// ////////////////////////////////////////////////////////
// 
// J_Thread.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ͨ��������Thread�����ഴ���̵߳����̡�
// ////////////////////////////////////////////////////////

public class J_Thread extends Thread
{
    private int m_threadID;

    public J_Thread(int i)
    {
        m_threadID = i;
        System.out.println("�����߳�: " + i);
    } // J_Thread���췽������
    
    public void run( )
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("�����߳�: " + m_threadID);
            try
            {
                Thread.sleep((int)(Math.random( ) * 1000));
            }
            catch( InterruptedException e )
            {
                System.err.println("�쳣InterruptedException: " + e);
                e.printStackTrace( );
            } // try-catch�ṹ����
        } // forѭ������
    } // ����run����
    
    public static void main( String args[ ] )
    { 
        new J_Thread(1).start( );
        new J_Thread(2).start( );
        new J_Thread(3).start( );
        System.out.println("����main����");
    } // ����main����
} // ��J_Thread����
