package ch03;

public class J_Book
{
    public int m_id; // 书的编号
    public static int m_bookNumber = 0; // 书的总数

    public J_Book( )
    {
        m_bookNumber ++;
    } // J_Book构造方法结束

    public void mb_info( )
    {
        System.out.println( "当前书的编号是：" + m_id);
    } // 方法mb_info结束

    public static void mb_infoStatic( )
    {
        System.out.println( "书的总数是：" + m_bookNumber);
    } // 方法mb_infoStatic结束

    public static void main(String args[ ])
    {
        J_Book a = new J_Book( );
        J_Book b = new J_Book( );
        a.m_id = 1101;
        b.m_id = 1234;
        System.out.print( "变量a对应的");
        a.mb_info( );
        System.out.print( "变量b对应的");
        b.mb_info( );
        J_Book.mb_infoStatic( );
        System.out.println( "比较(a.m_bookNumber==J_Book.m_bookNumber)"
            + "的结果是：" + (a.m_bookNumber==J_Book.m_bookNumber));
        System.out.println( "比较(b.m_bookNumber==J_Book.m_bookNumber)"
            + "的结果是：" + (b.m_bookNumber==J_Book.m_bookNumber));
    } // 方法main结束
} // 类J_Book结束

