// ////////////////////////////////////////////////////////
// 
// J_StringArray.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ����Ϊ�ַ�������ķ����������̡�
// ////////////////////////////////////////////////////////
package ch04;

public class J_StringArray
{
    public static void mb_swap(String [ ] s)
    {
        if (s.length<2)
            return;
        String t= s[0];
        s[0]= s[1];
        s[1]= t;
    } // ����mb_swap����

    public static void main(String args[ ])
    {
        String [ ] s= {"1", "2"};
        mb_swap(s);
        System.out.print(s[0]+s[1]);
    } // ����main����
} // ��J_StringArray����
