package ch03;

class J_Book1
{
    public int m_id; // 书的编号

    public J_Book1( int i )
    {
        m_id = i;
    } // J_Book构造方法结束

    protected void finalize( )
    {
        switch (m_id)
        {
        case 1:
            System.out.print( "《飘》" );
            break;
        case 2:
            System.out.print( "《Java程序设计教程》" );
            break;
        case 3:
            System.out.print( "《罗马假日》" );
            break;
        default:
            System.out.print( "未知书籍" );
            break;
        } // switch语句结束
        System.out.println( "所对应的实例对象存储单元被回收" );
    } // 方法finalize结束
} // 类J_Book结束

public class J_Finalize
{
    public static void main(String args[ ])
    {
        J_Book1 book1= new J_Book1( 1 );
        new J_Book1( 2 );
        new J_Book1( 3 );
        System.gc( ); // 申请立即回收垃圾
    } // 方法main结束
} // 类J_Finalize结束
