// ////////////////////////////////////////////////////////
// 
// J_String.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ����Ϊ�ַ����ķ����������̡�
// ////////////////////////////////////////////////////////
package ch04;
public class J_String
{
    public static void mb_operate
    (String x, String y){
    	x=x.concat(y);        
        y=x;        
        System.out.println(x + "." + y);
        System.out.println("-----------");
    } // ����mb_operate����

    public static void mb_operateb
    (StringBuffer x, StringBuffer y){
    	x.append(y);        
        y=x;        
        System.out.println(x + "." + y);
        System.out.println("-----------");
    } //
    public static void main(String args[ ])
    {
        String a = "A";
        String b = "B";
        mb_operate(a, b);
        System.out.println(a + "." + b);
        StringBuffer ba=new StringBuffer(a);
        StringBuffer bb=new StringBuffer(b);
        mb_operateb(ba,bb);
        System.out.println(ba + "." +bb);
    } // ����main����
} // ��J_String����
