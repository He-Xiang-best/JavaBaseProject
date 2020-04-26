package ch03;

public class J_Circle implements J_Shape
{
    public double m_x, m_y; // 圆心坐标
    public double m_radius; // 半径

    public J_Circle(double r)
    {
        m_x = 0;
        m_y = 0;
        m_radius = r;
    } // J_Circle构造方法结束

    public J_Circle(double x, double y, double r)
    {
        m_x = x;
        m_y = y;
        m_radius = r;
    } // J_Circle构造方法结束

    // 计算并返回形状的面积
    public double mb_getArea( )
    {
        return (Math.PI*m_radius*m_radius);
    } // 方法mb_getArea结束
} // 类J_Circle结束
