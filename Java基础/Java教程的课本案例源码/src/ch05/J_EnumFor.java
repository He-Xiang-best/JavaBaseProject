// ////////////////////////////////////////////////////////
// 
// J_EnumFor.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     for���ļ�д����ö�����������е�Ӧ�����̡�
// ////////////////////////////////////////////////////////
package ch05;

enum E_SEASON
{
    ����, �ļ�, �＾, ���� 
} // ö��E_SEASON����

public class J_EnumFor
{
    public static void main(String args[ ])
    {
        for ( E_SEASON c : E_SEASON.values( ))
            System.out.print(c + ", ");
        System.out.println( );

        E_SEASON [ ] ca = E_SEASON.values( );
        for ( int i=0; i< ca.length; i++ )
        {
            E_SEASON c = ca[i];
            System.out.print(c + ", ");
        } // forѭ������
        System.out.println( );
    } // ����main����
} // ��J_EnumFor����
