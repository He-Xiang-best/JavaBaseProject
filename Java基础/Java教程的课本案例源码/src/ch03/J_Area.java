package ch03;

public class J_Area
{
    public static void main(String args[ ])
    {
        J_Shape a = new J_Circle( 5 );
        System.out.println("�뾶Ϊ5��Բ�������" + a.mb_getArea( ));
        a = new J_Rectangle(0 , 0, 3, 4);
        System.out.println("�����ľ��������" + a.mb_getArea( ));
    } // ����main����
} // ��J_Area����
