// ////////////////////////////////////////////////////////
// 
// J_StringArray.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     参数为字符串数组的方法调用例程。
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
    } // 方法mb_swap结束

    public static void main(String args[ ])
    {
        String [ ] s= {"1", "2"};
        mb_swap(s);
        System.out.print(s[0]+s[1]);
    } // 方法main结束
} // 类J_StringArray结束
