package ch02;
public class J_CastExample
{
    public static void main(String args[ ])
    {
        short  a= 100;
        long   b= a; // ��ʽ����ת��

        System.out.println("����ת��: ������" + a + "��ɳ�����" + b);
        b= 123456789L;
        a= (short)b; // ��ʽ����ת����ǿ������ת��
        System.out.println("����ת��: ������" + b + "��ɶ�����" + a);
        System.out.println(3/6*12);
        //;

    } // ����main����
} // ��J_CastExample����
