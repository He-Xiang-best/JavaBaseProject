package ch02;

public class J_Break
{
    public static void main(String args[ ])
    {
        int i = 0; // �������i��������ֵ0
        aBreakBlock:
        {
            System.out.println("��break���֮ǰ");
            if (i<=0)
                 break aBreakBlock; // ��������aBreakBlock����
            System.out.println("��if��break���֮��");
        } // ����aBreakBlock����
        System.out.println("��aBreakBlock����֮��");
    } // ����main����
} // ��J_Break����
