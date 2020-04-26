package ch11;

// ////////////////////////////////////////////////////////
// 
// J_ThreadGroup.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ��ȡ��ǰ�������е��̸߳����������Ƶ����̡�
// ////////////////////////////////////////////////////////


public class J_ThreadGroup
{    
    public static void main(String args[ ])
    {
        System.out.print("����main���ڵ��߳��麬��");
        System.out.println(Thread.activeCount( ) + "���߳�");
        Thread t= Thread.currentThread( );
        ThreadGroup tg=t.getThreadGroup( );

        for(; tg!=null; tg=tg.getParent( ))
        {
            System.out.print("�߳���" + tg.getName( ));
            System.out.print("����");
            System.out.println(tg.activeCount( ) + "���߳�");
            int n=tg.activeCount( );
            Thread[ ] tList=new Thread[n];
            int m=tg.enumerate(tList);
            for (int i=0; i<m; i++)
                System.out.println("    ���е�" + (i+1) + "���߳���Ϊ" 
                    + tList[i].getName( ));
        } // forѭ������
    } // ����main����
} // ��J_ThreadGroup����