// ////////////////////////////////////////////////////////
// 
// J_AddInterface.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     �������̡�
// ////////////////////////////////////////////////////////
package ch05;

interface J_Interface <T extends Number>
{
    public int mb_sum(T a1, T a2, T a3);
} // �ӿ�J_Interface����

public class J_AddInterface  <T extends Number>
    implements J_Interface <T>
{
    public int mb_sum(T a1, T a2, T a3)
    {
        int b1 = a1.intValue( );
        int b2 = a2.intValue( );
        int b3 = a3.intValue( );
        return( b1 + b2 + b3 );
    } // ����mb_sum����

    public static void main(String args[ ])
    {
        J_AddInterface<Double> b = new J_AddInterface<Double>( );
        Double a1 = new Double(1);
        Double a2 = new Double(2);
        Double a3 = new Double(3);
        System.out.println( b.mb_sum(a1, a2, a3) );
    } // ����main����
} // ��J_AddInterface����
