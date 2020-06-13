package ch03;

class J_Time
{
    public int m_month = 1;
} // 类J_Time结束

public class J_Reference
{
    public static void mb_method( J_Time t )
    {
        System.out.println("在t.m_month++之前t.m_month=" + t.m_month);
        t.m_month++;
        System.out.println("在t.m_month++之后t.m_month=" + t.m_month);
    } // 方法mb_method结束

    public static void main(String args[ ])
    {
        J_Time a = new J_Time( );
        System.out.println("在方法调用之前a.m_month=" + a.m_month);
        mb_method( a );
        System.out.println("在方法调用之后a.m_month=" + a.m_month);
    } // 方法main结束
} // 类J_Reference结束
