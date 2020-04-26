package ch03;

public class J_Book
{
    public int m_id; // ��ı��
    public static int m_bookNumber = 0; // �������

    public J_Book( )
    {
        m_bookNumber ++;
    } // J_Book���췽������

    public void mb_info( )
    {
        System.out.println( "��ǰ��ı���ǣ�" + m_id);
    } // ����mb_info����

    public static void mb_infoStatic( )
    {
        System.out.println( "��������ǣ�" + m_bookNumber);
    } // ����mb_infoStatic����

    public static void main(String args[ ])
    {
        J_Book a = new J_Book( );
        J_Book b = new J_Book( );
        a.m_id = 1101;
        b.m_id = 1234;
        System.out.print( "����a��Ӧ��");
        a.mb_info( );
        System.out.print( "����b��Ӧ��");
        b.mb_info( );
        J_Book.mb_infoStatic( );
        System.out.println( "�Ƚ�(a.m_bookNumber==J_Book.m_bookNumber)"
            + "�Ľ���ǣ�" + (a.m_bookNumber==J_Book.m_bookNumber));
        System.out.println( "�Ƚ�(b.m_bookNumber==J_Book.m_bookNumber)"
            + "�Ľ���ǣ�" + (b.m_bookNumber==J_Book.m_bookNumber));
    } // ����main����
} // ��J_Book����
