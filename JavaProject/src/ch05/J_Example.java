// ////////////////////////////////////////////////////////
// 
// J_Example.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     for���ļ�д�������������е�Ӧ�����̡�
// ////////////////////////////////////////////////////////
package ch05;

public class J_Example
{
    public static void main(String args[ ])
    {
        int [ ] a = {10, 20, 30, 40, 50};
        int s = 0;
        for ( int c : a)
            s += c; // ������Ҫע��c�������Ԫ�أ���������Ӧ���±�
        System.out.println("����a��Ԫ��֮�͵���" + s);

        s = 0;
        for ( int i=1; i<=a.length; i++ )
            s += i;
        System.out.println("��1һֱ�ӵ�����a��Ԫ�س��ȣ��������" + s);

        s = 0;
        int [ ] ca = a;
        for ( int i=0; i< ca.length; i++ )
        {
            int c = ca[i];
            s += c;
        } // forѭ������
        System.out.println("����a��Ԫ��֮�͵���" + s);
    } // ����main����
} // ��J_Example����