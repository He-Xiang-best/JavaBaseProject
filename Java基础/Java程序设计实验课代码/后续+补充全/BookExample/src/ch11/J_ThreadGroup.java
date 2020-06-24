package ch11;

// ////////////////////////////////////////////////////////
// 
// J_ThreadGroup.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     获取当前正在运行的线程个数及其名称的例程。
// ////////////////////////////////////////////////////////


public class J_ThreadGroup
{    
    public static void main(String args[ ])
    {
        System.out.print("方法main所在的线程组含有");
        System.out.println(Thread.activeCount( ) + "个线程");
        Thread t= Thread.currentThread( );
        ThreadGroup tg=t.getThreadGroup( );

        for(; tg!=null; tg=tg.getParent( ))
        {
            System.out.print("线程组" + tg.getName( ));
            System.out.print("含有");
            System.out.println(tg.activeCount( ) + "个线程");
            int n=tg.activeCount( );
            Thread[ ] tList=new Thread[n];
            int m=tg.enumerate(tList);
            for (int i=0; i<m; i++)
                System.out.println("    其中第" + (i+1) + "个线程名为" 
                    + tList[i].getName( ));
        } // for循环结束
    } // 方法main结束
} // 类J_ThreadGroup结束
