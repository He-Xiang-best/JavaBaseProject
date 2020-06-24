// ////////////////////////////////////////////////////////
// 
// J_String.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     参数为字符串的方法调用例程。
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
    } // 方法mb_operate结束

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
    } // 方法main结束
} // 类J_String结束
