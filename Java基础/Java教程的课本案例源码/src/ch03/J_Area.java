package ch03;

public class J_Area
{
    public static void main(String args[ ])
    {
        J_Shape a = new J_Circle( 5 );
        System.out.println("半径为5的圆的面积是" + a.mb_getArea( ));
        a = new J_Rectangle(0 , 0, 3, 4);
        System.out.println("给定的矩形面积是" + a.mb_getArea( ));
    } // 方法main结束
} // 类J_Area结束
