// ////////////////////////////////////////////////////////
// 
// J_Enum.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ö�����̡�
// ////////////////////////////////////////////////////////
package ch05;

enum E_SEASON1
{
    ����, �ļ�, �＾, ���� 
} // ö��E_SEASON����

public class J_Enum
{
	
    public static void main(String args[ ])
    {
        E_SEASON1 [ ] sa = E_SEASON1.values( );
        for ( E_SEASON1 sea:sa )
        {
            switch(sea)
            {
            case ����:
                System.out.println("����������");
                break;
            case �ļ�:
                System.out.println("�ļ����ޱ�");
                break;
            case �＾:
                System.out.println("�＾������");
                break;
            case ����:
                System.out.println("����ѩ����");
                break;                
            } // switch�ṹ����
        } // forѭ������
    } // ����main����
} // ��J_Enum����
