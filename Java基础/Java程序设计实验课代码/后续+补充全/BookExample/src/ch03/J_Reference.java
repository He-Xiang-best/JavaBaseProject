package ch03;

class J_Time
{
    public int m_month = 1;
} // ��J_Time����

public class J_Reference
{
    public static void mb_method( J_Time t )
    {
        System.out.println("��t.m_month++֮ǰt.m_month=" + t.m_month);
        t.m_month++;
        System.out.println("��t.m_month++֮��t.m_month=" + t.m_month);
    } // ����mb_method����

    public static void main(String args[ ])
    {
        J_Time a = new J_Time( );
        System.out.println("�ڷ�������֮ǰa.m_month=" + a.m_month);
        mb_method( a );
        System.out.println("�ڷ�������֮��a.m_month=" + a.m_month);
    } // ����main����
} // ��J_Reference����
