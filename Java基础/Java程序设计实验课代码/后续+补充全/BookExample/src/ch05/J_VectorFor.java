// ////////////////////////////////////////////////////////
// 
// J_VectorFor.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     第一类for语句的简化写法例程。
// ////////////////////////////////////////////////////////
package ch05;

import java.util.Iterator;
import java.util.Vector;

public class J_VectorFor
{
    public static void main(String args[ ])
    {
        Vector<String> a = new Vector<String>( );
        a.add( "a" );
        a.add( "b" );
        a.add( "c" );

        for( String c : a)
            System.out.print(c + ", ");
        System.out.println( );

        for( Iterator<String> i=a.iterator( ); i.hasNext( ); )
        {
            String c = i.next( );
            System.out.print(c + ", ");
        } // for循环结束
        System.out.println( );
    } // 方法main结束
} // 类J_VectorFor结束
