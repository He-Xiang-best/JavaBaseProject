package ch03;

class J_Book1
{
    public int m_id; // ��ı��

    public J_Book1( int i )
    {
        m_id = i;
    } // J_Book���췽������

    protected void finalize( )
    {
        switch (m_id)
        {
        case 1:
            System.out.print( "��Ʈ��" );
            break;
        case 2:
            System.out.print( "��Java������ƽ̡̳�" );
            break;
        case 3:
            System.out.print( "��������ա�" );
            break;
        default:
            System.out.print( "δ֪�鼮" );
            break;
        } // switch������
        System.out.println( "����Ӧ��ʵ������洢��Ԫ������" );
    } // ����finalize����
} // ��J_Book����

public class J_Finalize
{
    public static void main(String args[ ])
    {
        J_Book1 book1= new J_Book1( 1 );
        new J_Book1( 2 );
        new J_Book1( 3 );
        System.gc( ); // ����������������
    } // ����main����
} // ��J_Finalize����
