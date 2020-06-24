// ////////////////////////////////////////////////////////
// 
// J_Example.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     for语句的简化写法在整数数组中的应用例程。
// ////////////////////////////////////////////////////////
package ch05;

public class J_Example
{
    public static void main(String args[ ])
    {
        int [ ] a = {10, 20, 30, 40, 50};
        int s = 0;
        for ( int c : a)
            s += c; // 这里需要注意c是数组的元素，而不是相应的下标
        System.out.println("数组a的元素之和等于" + s);

        s = 0;
        for ( int i=1; i<=a.length; i++ )
            s += i;
        System.out.println("从1一直加到数组a的元素长度，结果等于" + s);

        s = 0;
        int [ ] ca = a;
        for ( int i=0; i< ca.length; i++ )
        {
            int c = ca[i];
            s += c;
        } // for循环结束
        System.out.println("数组a的元素之和等于" + s);
    } // 方法main结束
} // 类J_Example结束
