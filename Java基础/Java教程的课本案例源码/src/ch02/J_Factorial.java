package ch02;

public class J_Factorial
{
    public static void main(String args[ ])
    {
        int i;      // ����i����Ϊ������
        int result; // ������ż�����

        result= 1;  // ��ʼ��
        for (i=1; i<= 10; i++)
            result*=i;
        System.out.println("10!=" + result);
    } // ����main����
} // ��J_Factorial����
