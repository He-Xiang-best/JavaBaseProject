package ch03;
public class J_Month
{
    private int m_month = 1;  // 月份，要求取值从1到12

    public int mb_getMonth( )
    {
        return m_month;
    } // 方法mb_getMonth结束

    public int mb_setMonth(int m)
    {
        if (m<1)
            m_month= 1;
        else if (m>12)
            m_month= 12;
        else m_month= m;

        return m_month;
    } // 方法mb_setMonth结束
} // 类J_Month结束
