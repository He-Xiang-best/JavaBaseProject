package ch03;

public class J_Primitive
{
    public static void mb_method( int a )
    {
        System.out.println("��a++֮ǰ��������a=" + a);
        a++;
        System.out.println("��a++֮�󷽷�����a=" + a);
    } // ����mb_method����

    public static void main(String args[ ])
    {
        int i=0;
        System.out.println("�ڷ�������֮ǰ����i=" + i);
        J_Primitive.mb_method(i);
        System.out.println("�ڷ�������֮�����i=" + i);
    } // ����main����
} // ��J_Primitive����

